package collections_and_generics;

import java.util.ArrayList;

public class Application1 {

	public static void main(String[] args) {
	
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("Lion");
		animal.add("Cat");
		animal.add("Dog");
		animal.add("Tiger");
		
//		for(int i = 0; i < animal.size(); i++) {
//			System.out.println(animal.get(i));
//		}
//		
//		for(String value : animal) {
//			System.out.println(value);
//		}
		
		ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>(); // by default size is 10;
		vehicle.add(new Vehicle("Honda", "accord", 10000, true)); // this way is to create the object and pass the value
		
		Vehicle vehicle2 = new Vehicle("Hero", "Maestro", 12000, false);
		vehicle.add(vehicle2);
		
		for(Vehicle car : vehicle) {
			System.out.println(car.getMake());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
			
			System.out.println(car);
		}
		
		
	}

}
