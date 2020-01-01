package streamPractical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {

		// Integer Stream without intermediate function
		
		IntStream
		.range(1, 10)
		.forEach((x)-> System.out.print(x));
		System.out.println();
	
	//Integer Stream with intermediate function skip()
	
		IntStream
		.range(1, 10)
		.skip(5)    // Sip 5 element with stream
		.forEach((x)-> System.out.print(x));
		
		System.out.println();	
		
		// Integer stream with sum
		
		int val = IntStream
				.range(1, 5)
				.sum();
		System.out.println(val);
		
		// Stream of sorted and findFirst
		
		Stream.of("Hello","Battle","Africa")
		.sorted()
		.findFirst()
		.ifPresent((x) -> System.out.println(x));
		
		// stream form array , sort, filter and print
		String [] items = {"car","Computer","toothpaste","box","pencil","tent","door","toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("t"))
			.sorted()
			.forEach(x -> System.out.print(x + ","));
		System.out.println();
		
		// Average of squares of an int array
		Arrays.stream(new int[] {2,4,6,8,10})
			.map((x ) ->  x * x)
			.average()
			.ifPresent(n -> System.out.print(n));
		System.out.println();
		
		// Stream of file
		Stream<String> lines = Files.lines(Paths.get("streamPractical/wordFile.txt"));
			lines.sorted()
			.filter(l -> l.length() > 6)
			.forEach(x -> System.out.print(x + ","));
		lines.close();
		
		List<String> words = Files.lines(Paths.get("streamPractical/wordFile.txt"))
			// lines.sorted()
			.filter(x -> x.contains("th"))
			.collect(Collectors.toList());
		words.forEach(x -> System.out.print("\n" +x + ","));
		
		// Stream file work on different data
		Stream<String> rows = Files.lines(Paths.get("streamPractical/stockDatacsv.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.count();
		System.out.println("\n"+ rowCount + " good rows.");
		rows.close();
		
		Stream<String> row = Files.lines(Paths.get("streamPractical/stockDatacsv.txt"));
				row.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.filter(x -> Integer.parseInt(x[1].trim()) > 15)
				.forEach(x -> System.out.println(x[0].trim()+ " " +x[2].trim()+" "+ x[3].trim()));
		row.close();
		
	}

}
