package collectionMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(70);
		list1.add(70);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(70);
		
		
		//list1.clear(); // clear all the value from the list
		//list1.addAll(list2); // here add the all item of list2 in list1
		//list1.removeAll(list2); // remove all the value of list2
		
		boolean values = list1.contains(40);
		System.out.println(values);
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(50);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(05);
		hashSet.add(05);
		hashSet.add(05); // we are using hashSet so duplicate value is not taken from the hashSet values
		
		ArrayList<Integer> list = new ArrayList<Integer>(hashSet);
		
		Collections.sort(list); // Collections.sort() method only take the list value in parameter not hashSet value for that u convert the hashSet into list
		System.out.println(list);
		
		Collections.reverse(list); // this is sort the value in descending order
		System.out.println(list);
		
		
		HashSet<String> hashset1 = new HashSet<String>();
		hashset1.add("Random");
		hashset1.add("Azam");
		hashset1.add("Tooth Brush");
		hashset1.add("Clothes");
		
		
		ArrayList<String> li = new ArrayList<String>(hashset1);
		
		Collections.sort(li);
		System.out.println(li);
		
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee("Azam", 25000, "Software Development"));
		emp.add(new Employee("John", 20000, "Testing"));
		emp.add(new Employee("Smith", 30000, "Manager"));
		
		
		ArrayList<Employee> emplist	= new ArrayList<Employee>(emp);
		// if Any userDefined class aur type u pass in argument in Collection you first implements the Comaparbale interface in userdefine class 
		Collections.sort(emplist);
		
		System.out.println(emplist);
		
		Collections.reverse(emplist);
		System.out.println(emplist);
		
	}

}
