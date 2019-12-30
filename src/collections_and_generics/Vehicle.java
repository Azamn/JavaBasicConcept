package collections_and_generics;

public class Vehicle {
	String make;
	String model;
	int price;
	boolean foorWDrive;
	
	
	public Vehicle(String make, String model, int price, boolean foorWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.foorWDrive = foorWDrive;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", foorWDrive=" + foorWDrive + "]";
	}




	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFoorWDrive() {
		return foorWDrive;
	}
	public void setFoorWDrive(boolean foorWDrive) {
		this.foorWDrive = foorWDrive;
	}
	
	

}
