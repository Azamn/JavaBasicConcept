package InterviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicateString {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String which have dupliacte alphabet present : ");
		String str = sc.next();
		String str1 = removeDuplicates(str);
		System.out.println("After Removing Duplicate from String is : "+str1);
	
		
	}

	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			Character c = str.charAt(i); //this takes the first element from the string 
			if(!set.contains(c)) { // if the element is not present in the hashset 
				set.add(c);        // add in the set 
				sf.append(c);		// add in the string buffer
			}
		}
		
		return sf.toString();   // return the string 
	}
}
