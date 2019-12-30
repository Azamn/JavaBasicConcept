package carDealershipProject;

public class Dealership {
	
	public static void main(String args[]) {
		
		Customer cust1 = new Customer("John"," Navi Mumbai",25000);
		
		
		Vehicle vehicle = new Vehicle("Honda","Accord",15000);
		
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("Honda", "Accord", 15000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
	}

}
  