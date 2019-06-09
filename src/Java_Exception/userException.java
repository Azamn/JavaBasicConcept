package Java_Exception;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class userException {
	static void convertDateFormat(String inputDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Date date =sdf.parse(inputDate);
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-mm-dd");
			String outputDate = outputsdf.format(date);
			System.out.println("After Chnaging the date format to yyyy-mm-dd : "+outputDate);
		}catch(java.text.ParseException e) {
			System.out.println("Some error occured while converting date formats. Exception handled");
		}
	}

	
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy Format :");
		String inputDate = sc.nextLine();
		convertDateFormat(inputDate);
	}
}
