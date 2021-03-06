package JavaLambda;

@FunctionalInterface  // Annotation
interface cab{ // when an interface will have exactly 1 abstract method we can say it as a Functional Interface
	//void bookCab() // 
	//void bookCab(String source , String destination); //by default public abstract void bookCab();
	double bookCab(String source , String destination); //by default public abstract void bookCab();
	
}

//class uberX implements cab{
//	public void bookCab() {
//		System.out.println("UberX Booked  !! Arriving Soon..!");
//	}
//}

public class lambdaApp {
	
	static String str = "Intance variable";
	static int svar = 10000;
	public static void main(String args[]) {
	
		// 1st way to implement
//		cab cab = new uberX();
//		cab.bookCab();
		
		//2nd way to implement
		// Anonymous Class implementation
//		cab cab = new cab() { 
//			
//			@Override
//			public void bookCab() {
//				// TODO Auto-generated method stub
//				System.out.println("UberX Booked  !! Ariving Soon..!");
//			}
//		};
		
		//cab.bookCab();
		
		// 3.
		// using a lambda Expression -> ONly works on functional programming
		
		cab Cab = (source, destination)->{
			int localVariable = 10;
			System.out.println("Uberx booked from "+source+" to "+destination+"..!");
			System.out.println("Static Variable is : "+svar);
			System.out.println("Instance Variable is :"+lambdaApp.str);
			System.out.println("Local Variable is :"+localVariable);
			return 850.57;
			
			
		};
		
		double fare = Cab.bookCab("Pnavel","Andheri");
		System.out.println("Fare shall be :"+fare);
	}	

}
