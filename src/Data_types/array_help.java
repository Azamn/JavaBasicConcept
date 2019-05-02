package Data_types;

import java.util.Scanner;

public class array_help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double invoice[][] = new double[15][2]; //j two dimension table that is 15 rows nd to column
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<2 ;j++) {
				
				System.out.println("Enter The Value.");
				invoice[i][j] = sc.nextDouble();
			}
		}
		for(int i=0;i<15;i++) {
			for(int j=0;j<2 ;j++) {
				
				System.out.println(invoice[i][j]);
				
			}
		}
	}

}
