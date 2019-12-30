package Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	
	public static void main(String args[]) {
		
		// generics is to define the which type of data
		//this is a raw type Arraylist it means u can store any type of data eg:- int, String, Boolean etc.
		// Getting that value from the list then u can to cast to which type of data u rgetting eg:- int String
		
		
		ArrayList mylist = new ArrayList();
		mylist.add(5);
		mylist.add("azam");
		mylist.add(false);
		
		int myVal = (int) mylist.get(0);
		String myVal2 = (String) mylist.get(1);
		
		System.out.println(myVal);
		System.out.println(myVal2);
		
		// Using generics class you can flexible to use type programm
		// you can pass any type of data.
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		//Object myvar = container.getItem1(); 		
		//String myvar2 = (String)container.getItem2(); // every Object is string
		
		int myvar = container.getItem1();
		String myvar2 = container.getItem2();
		
		System.out.println(myvar + " " + myvar2);
		
		
		Container<Double, Integer> container2 = new Container<Double, Integer>(15.00, 50);
		double var1 = container2.getItem1();
		int var2 = container2.getItem2();
		System.out.println(var1 + " " + var2);
		
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("Hiee");
		mySet1.add("Collection");
		mySet1.add("And");
		
		
		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("Hiee");
		mySet2.add("Generics");
		mySet2.add("are");
		mySet2.add("Really");
		mySet2.add("Awesome");
		
		Set<String> myreSultSet = union(mySet1,mySet2);
		Iterator<String> itr = myreSultSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) { // set can only store unique value 
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
	}

}
