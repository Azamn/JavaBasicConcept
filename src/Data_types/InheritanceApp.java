package Data_types;

class Product{
	
	//Attributes
	
	//private int pid;
	int pid;
	String pname;
	double price;
	
	// Constructor
	
	Product(){
		System.out.println(">> Product object Constructed");
	}
	
	// Methods to set the data
	
	void setProductDetails(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	// Methods to show the data
	
	void showProdctDetails() {
		System.out.println("******** Product ID = "+pid+" **********");
		System.out.println("Name : \t"+pname);
		System.out.println("Price : \t"+price);
		System.out.println("***************************************");
	}
	// Setter
	
	void setPid(int pid) {
		this.pid = pid; // this means reference to current object
						// LHS belongs to the object and RHS belongs to method
	}
	// getter		
					// Getter and Setter require when attribute is private
	int getPid() {
		return pid;
	}
	
}

class Mobile extends Product{ // Is-A relation, Mobile Is-A Product, Mobile is child, Product is Parent
	// this is additional details of mobile other than product
	String os;
	int ram,sdCardSize;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructor");
	}
	// we have redefined the same method from the parent into the child with differ inputs
	// we have two methods in the child , 1 from parent and 1 from child
	//both are different as in based on inputs(even though as a same name)
	// Methods overloading : same method name with different inputs
	
		void setProductDetails(int pid, String pname, double price,String os,int ram, int sdCardSize) {
			this.pid = pid;
			this.pname = pname;
			this.price = price;
			this.os=os;
			this.ram = ram;
			this.sdCardSize = sdCardSize;
			System.out.println(">> Data written in Mobile object");
			
		}
		// redefined showDetails method
		//but there we have same inputs
		// 2 method, 1 from parent and 1 from child and we have same signature	
		//child methods will be executed and not the parent method	
		
		// Method Overriding : Same method name with same Inputs in parent Child Relationship
		void showProdctDetails() {
			System.out.println("******** Product ID = "+pid+" **********");
			System.out.println("Name : \t"+pname);
			System.out.println("Price : \t"+price);
			System.out.println("Os : \t"+os);
			System.out.println("ram : \t"+ram);
			System.out.println("SdCardASize : \t"+sdCardSize);
			System.out.println("***************************************");
		}
}

public class InheritanceApp {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * 
		 * Product product1 = new Product(); // prodct is not an object its a reference
		 * variable which holds the hashcode of the object in hexadecimal
		 * 
		 * System.out.println("The product is = "+product1); // this prints the hashcode
		 * of reference variable @15db9742
		 * 
		 * // writing the data in object product1.setProductDetails(101, "iPhone",
		 * 15000);
		 * 
		 * // Reading data from the object product1.showProdctDetails();
		 * 
		 * Product product2 = new Product(); //product2.pid=102; // this is direct send
		 * the value without setter so setter method is not call product2.setPid(205);
		 * product2.pname="mi"; product2.price=12500;
		 * 
		 * product2.showProdctDetails();
		 */
		
		// Requesting to get Mobile Object Construted.
		Mobile mobile = new Mobile(); 
		//Product objects gets constructed before the mobile object. This is rule to inheritance
		
		mobile.setProductDetails(101, "Samsung", 500);
		//mobile.showProdctDetails();
		mobile.setProductDetails(102, "one plus 6 t", 30000, "Android penust", 8, 256);
		mobile.showProdctDetails();
	}

}
