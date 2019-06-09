package Java_Exception;


// try, catch,finally, block concept

//package Java_Exception;
//
//public class sampleException {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = null;
//		//System.out.println(str.length());
//		try {
//			int a = 30,b=0;
//			int c = a/b;
//			System.out.println("The result is = "+c);
//		}catch (ArithmeticException e) {
//			System.out.println("Cant divide a number by zero");
//			// TODO: handle exception
//		}
//		try {
//			try {
//				int num = Integer.parseInt("Azam");
//					System.out.println(num);
//				}catch(NumberFormatException e) {
//					System.out.println("Number Format Exception");
//				}
//			try {
//				int a[] = new int[5];
//				a[7] =9;
//			}catch(Exception e) {
//				System.out.println("Handled");
//			}
//			System.out.println("other Statement");
//			}
//				catch(ArrayIndexOutOfBoundsException e) {
//					System.out.println("Array Index Exception");
//		}finally {
//			System.out.println("All done.");
//		}
//	}
//}

// throw and throws concept

public class sampleException {

	static void avg() {
		try {
			throw new ArithmeticException("Demo");
		}catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}
	
	static void avg1() throws ArithmeticException {
		System.out.println("Inside avg function");
		throw new ArithmeticException("Demo");
	}
	
	public static void main(String args[]) {
		try {
			avg();
			avg1();
		}finally {
			System.out.println("Caught throws Exception");
		}
		
	}
}



