package collections_and_generics;

import java.util.ArrayList;
import java.util.LinkedList;

import Data_types.numberSequence;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In ArrayList we can store all data type of data
		// it treats as a object every data
		// for adding  the data in array list we can use add() methods.
		
		// retrieving the data from the Array List using the get() methods as per index value.
		
		// Array List is resizeable
		
		ArrayList words = new ArrayList();
		words.add("Hello");
		words.add("there");
		words.add(100);
		words.add(9);
		words.add(12.00);
		words.add('H');
		
		
		
		String item1 = (String) words.get(0);  // here return the get Methods as a object but we store in String variable so for thta cast that methoda as String
		
		int obj1 = (int) words.get(2); // if the same data time or you want to add then u can to convert in int and then u can add not in object type u acn add.
		int obj2 = (int) words.get(3); 
		
		Object item2 = words.get(1);
		Object item3 = words.get(2);
		
		System.out.println(item1 + "\n" +item2 + "\n" +item3);
		System.out.println(obj1 + obj2);
		
		// not pass the primitive type data type like int u want to pass INTEGER.
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(100);
		numbers.add(150);
		
		numbers.remove(0);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
	}

}
