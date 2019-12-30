package collections_and_generics;

import java.util.HashSet;

public class HashSetApplication {

	public static void main(String[] args) {
		
	HashSet<Integer> values = new HashSet<Integer>();
	values.add(5);
	values.add(10);
	values.add(15);
	values.add(20);
	values.add(20);
	
	for(int value : values) {
		System.out.println(value);
	}
	
	HashSet<String> values1 = new HashSet<String>();
	values1.add("Random");
	values1.add("People");
	values1.add("Random");
	values1.add("People");
	
	for(String result : values1) {
		System.out.println(result);
	}
	
	HashSet<Animal> animals = new HashSet<Animal>();
	Animal animal1 = new Animal("Lion",40);
	Animal animal2 = new Animal("Tiger",30);
	Animal animal3 = new Animal("Dog",12);
	Animal animal4 = new Animal("Lion",40);
	Animal animal5 = new Animal("cat",6);
	
	animals.add(animal1);
	animals.add(animal2);
	animals.add(animal3);
	animals.add(animal4);
	animals.add(animal5);
	
	System.out.println(animal1.equals(animal4));
	
	for(Animal value : animals) {
		System.out.println(value);
	}
		
	}

}
