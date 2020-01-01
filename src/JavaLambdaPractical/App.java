package JavaLambdaPractical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<car> cars = Arrays.asList(
			new car ("Honda","Accord","Red",22300),	
			new car ("Honda","Civic","Blue",17000),	
			new car ("Toyota","Land cruiser","White",458000),	
			new car ("Toyota","Corola","Black",16200),	
			new car ("Toyota","Conry","Blue",24000),
			new car ("Nisan","Sentra","White",17300)
			);
		
//		printCarsPriceRange(cars, 10000, 22000);
//		printCarByColor(cars, "Red");
		
		System.out.println("Printing cars between price 17000 and 22000");
		
		printCars(cars, new CarCondition() {
			
			@Override
			public boolean test(car c) {
				return c.getPrice() >= 17000 && c.getPrice() <= 22000;
				
			}
		});
		
		System.out.println("Printing cars that are blue");
		printCars(cars, new CarCondition() {
	
			@Override
			public boolean test(car c) {
				return c.getColor().equals("Blue");
				
			}
		});
				
	} 
	
	public static void printCars(List<car> cars, CarCondition condition) {
		for(car c : cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	
	public static void printCarsPriceRange(List<car> cars, int low, int high) {
		for(car c: cars) {
			if(low <= c.getPrice() && c.getPrice() <= high) {
				c.printCar();
			}
		}
	}
	
	public static void printCarByColor(List<car> cars, String color) {
		for(car c : cars) {
			if(c.getColor().equals(color)) {
				c.printCar();
			}
		}
	}

}

@FunctionalInterface
interface CarCondition{
	public boolean test(car c);
}
