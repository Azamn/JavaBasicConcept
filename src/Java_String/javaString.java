package Java_String;

public class javaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String literals
		// 	Stored in string pool
		// Str1 and str2 are reference variable pointing to the same literal
		String str1 = "hello";  
		String str2 = "hello";
		
		// we are not comparing content
		// we are comparing hashcode in str1 and str2 which will be same for the String Hello
		if(str1 == str2) {
			System.out.println("str1==str2");
		}else {
			System.out.println("Str1!=str2");
		}
		
		// String object we used new operator
		//String object stored in heap area with hello as its contents
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// we are not comparing content i.e hello
		// We are comparing hashcodes in str3 or str4 which will be different for the string Object Containing hello
		if(str3 == str4) {
			System.out.println("str3 == str4");
		}else {
			System.out.println("str3 != str4");
		}
		// Conclusion : == will compare reference variable i.e hascodes and not the real content i.e hello
		
		if(str3.equals(str4)) {
			System.out.println("str3 is equals to str4");
		}else {
			System.out.println("str3 and str4 is not equals ");
		}
	}

}
