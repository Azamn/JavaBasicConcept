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
		
		// String methods
		
		String str = "john,doe,jim,jack";
		int len = str.length(); // counts the string length
		System.out.println(len);
		//str.charAt(0);
		System.out.println(str.charAt(0)+" or "+str.charAt(len-1)); 
		//str.charAt(len-1);
		String s1 = str.toUpperCase();
		System.out.println("String are in uppercase : "+str);// no changes because string is immutable
		System.out.println("New String S1 = "+ s1); // now its changes because string are taken in new variable
		
		if(str.contains("jim")) { // contains is used to search the string 
			System.out.println("Jim is in the string");
		}else {
			System.out.println("Jim is not in String");
		}
		
		String s2 = str.substring(3); // Substring is used to eliminate the character or string at the index it takes begining of index no. where from eliminate
		System.out.println("Subtring is start from index 3 : "+s2);
		
		String s3 = str.substring(3, 8); // here is the substring of in between like starting index and ending index
		System.out.println("S3 = "+s3);
		
		String s4 = str.replace("d", "t"); // this is replace the old character with new character but all the character in the string are replace
		System.out.println("After Replacing Character :"+ s4);
		
		char[] chArr = str.toCharArray(); // this is convert the String in character array
		for(char ch : chArr) { // here we use for each Loop
			System.out.println(ch+" ");
		}
		System.out.println();
		
		String[] strArr = str.split(","); // here split is used to remove the , and make a meaningful string
		for(String s5 : strArr) {
			System.out.println(s5.trim()); // trim is used to remove the spaces from the String
		}
		
		// Data During Registration
		
		String email = "azamal.ishaikh@gmailcom";
		String phone = "213654798";
		String pass =  "password123";
		
		// Validate the user
		
		if(!email.isEmpty()) {
			System.out.println("email is available."); 
			if(!(email.contains("@") && email.contains(".com"))) {
				System.out.println("Email is not valid email.");
			}else {
				System.out.println("email is valid one.");
			}
		}else {
			System.out.println("Plz enter the email.");
		}
		
		
		if(!phone.isEmpty()) {
			System.out.println("phone is Available");
			if(phone.length()!=10) {
				System.out.println("But, Phone number is not a valid number.");
			}else {
				System.out.println("Phone no is valid one.");
			}
			
		}else {
			System.out.println("Please provide Phone no.");
		}
		
		// String is not immutable
		String string = "Hello";
		string.concat("world"); // this is like + operator concate but not change
		
		System.out.println("String is = "+string);
		
		// StringBuffer is Mutable
		// Mutable means you can change the value and modify the String	
		// StringBuffer is Thread Safe 
		StringBuffer buffer  =  new StringBuffer("hello");
		buffer.append(" world");
		System.out.println("Buffer is:"+buffer );
		
		// StringBuilder is not ThreadSafe
		StringBuilder builder = new StringBuilder("hello");
		builder.append(" World");
		System.out.println("Builder : "+builder);
		
		// RunTime Polymorphism
		
		CharSequence cs = null;
		cs = new String("Hello");
		cs = new StringBuffer("Good");
		cs = new StringBuilder("Awesome");
		 System.out.println(cs);
		
	}

}
