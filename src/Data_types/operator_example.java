package Data_types;

public class operator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int itema=200,itemb = 300,itemc = 150;
		double price;
		
		 price = ((itema*2)+(itemb)+(itemc*3)); // first evaluate bracket
		 price = price - (.1*price); 
		 price = price +(.05*price);
		 
		
		System.out.println(price);
		
		if(price > 1000) {
			System.out.println("Congrats you have a 25% discount coupn.");
		}else {
			System.out.println("Thank You for shopping.");
		}
	}

}
