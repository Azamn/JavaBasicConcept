package Collection;

import java.util.ArrayList;
import java.util.List;

class Bike{

	int bikeNo;
	String bikeName;
	double bikePrice;
	
	Bike(int bikeNo, String bikeName, double bikePrice){
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
	}
	
	public String toString() {
		return bikeNo + " " + bikeName + " " + bikePrice ;
	}
	
}


class factory{
	
	private Bike bike;
	private List<Bike>list;
	
	factory(){
		list = new ArrayList<Bike>();
	}
	
	public void CreateBike(int bikeNo, String bikeName, double bikePrice) {
		bike = new Bike(bikeNo, bikeName, bikePrice);
		list.add(bike);
	}
	public List<Bike>geBikeslist(){
		return list;
	}
	
}



public class Showroom {
	public static void main(String args[]) {
		
		factory factory = new factory();
		factory.CreateBike(1, "Activa", 45000);
		factory.CreateBike(2, "Honda Bike", 65000);
		factory.CreateBike(3, "Maestro", 50000);
		
		List<Bike>list=factory.geBikeslist();
		for(Bike bike : list) {
			System.out.println(bike);
		}
	}

}
