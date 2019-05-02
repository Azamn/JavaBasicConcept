package Data_types;

import java.util.Scanner;

public class Student_Marks_Control_Statement {
	
	public static void main(String args[]) {
		int maths, physics,chemistry,english,computer,studentCount;
		double finalmarks;
		//boolean results = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Count : ");
		studentCount = sc.nextInt();
		
	// Do while
		
//		do {
//			System.out.println("Emter the marks of maths : ");
//			maths = sc.nextInt();
//			System.out.println("Enter the marks of physics");
//			physics = sc.nextInt();
//			System.out.println("Enter the marks of Chemistry");
//			chemistry = sc.nextInt();
//			System.out.println("Enter the marks of Enlish");
//			english = sc.nextInt();
//			System.out.println("Enter the marks of Computer");
//			computer = sc.nextInt();
//			
//			finalmarks = (maths+chemistry+physics+english+computer);
//			finalmarks = finalmarks/5;
//			
//			if(finalmarks > 90) {
//				System.out.println("Excellent");	
//			}else if(finalmarks > 80) {
//				System.out.println("Very Good");
//			}else if(finalmarks >60) {
//				System.out.println("Good");
//			}else if(finalmarks > 40) {
//				System.out.println("Average");
//			}else {
//				System.out.println("Poor");
//			}
//			System.out.println("Any more students?(true / false):");
//			results = sc.nextBoolean();
//			
//		}while(results);
		
		// While 
		
//		while(results) {
//			System.out.println("Emter the marks of maths : ");
//			maths = sc.nextInt();
//			System.out.println("Enter the marks of physics");
//			physics = sc.nextInt();
//			System.out.println("Enter the marks of Chemistry");
//			chemistry = sc.nextInt();
//			System.out.println("Enter the marks of Enlish");
//			english = sc.nextInt();
//			System.out.println("Enter the marks of Computer");
//			computer = sc.nextInt();
//			
//			finalmarks = (maths+chemistry+physics+english+computer);
//			finalmarks = finalmarks/5;
//			
//			if(finalmarks > 90) {
//				System.out.println("Excellent");	
//			}else if(finalmarks > 80) {
//				System.out.println("Very Good");
//			}else if(finalmarks >60) {
//				System.out.println("Good");
//			}else if(finalmarks > 40) {
//				System.out.println("Average");
//			}else {
//				System.out.println("Poor");
//			}
//			System.out.println("Any more students?(true / false):");
//			results = sc.nextBoolean();
//		}
		
		// for loop 
		
		for(int i=0;i<studentCount;i++) {
			System.out.println("Emter the marks of maths : ");
			maths = sc.nextInt();
			System.out.println("Enter the marks of physics");
			physics = sc.nextInt();
			System.out.println("Enter the marks of Chemistry");
			chemistry = sc.nextInt();
			System.out.println("Enter the marks of Enlish");
			english = sc.nextInt();
			System.out.println("Enter the marks of Computer");
			computer = sc.nextInt();
			
			finalmarks = (maths+chemistry+physics+english+computer);
			finalmarks = finalmarks/5;
			
			if(finalmarks > 90) {
				System.out.println("Excellent");	
			}else if(finalmarks > 80) {
				System.out.println("Very Good");
			}else if(finalmarks >60) {
				System.out.println("Good");
			}else if(finalmarks > 40) {
				System.out.println("Average");
			}else {
				System.out.println("Poor");
			}
		}
			
	}

}
