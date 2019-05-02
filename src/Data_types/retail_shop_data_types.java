package Data_types;

import java.util.Scanner;

public class retail_shop_data_types {
	
	public static void main(String args[]) {
		int invoice_num, product_id, quantity;
		double cost,discount,price;
		boolean feedback;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Invoice Number : ");
		invoice_num=sc.nextInt();
		System.out.println("Enter Product_id : ");
		product_id = sc.nextInt();
		System.out.println("Enter the Price : ");
		price = sc.nextFloat();
		System.out.println("Enter Feedbcak : ");
		feedback = sc.nextBoolean();
		
		System.out.println("Invoice Number : "+invoice_num);
		System.out.println("Product_id : " + product_id);
		System.out.println("Price is : " + price);
		System.out.println("feedback is : "+ feedback);
	}

}
