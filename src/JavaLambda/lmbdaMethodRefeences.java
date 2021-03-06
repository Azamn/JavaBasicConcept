package JavaLambda;

@FunctionalInterface
interface Calculator{
	void add(int num1, int num2);
}

class Calci{
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and "+ num2 + " addition is : " +(num1+num2));
	}
	 public void letsAdd(int num1, int num2) {
		System.out.println(num1 + " and "+ num2 + " adds to : " +(num1+num2));

	 }
	
}

@FunctionalInterface
interface Messenger{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(">> Message is :"+msg);
	}
}

public class lmbdaMethodRefeences {
	public static void main(String args[]) {
		
		//Calci.addSomething(10, 20);
		
		//1. Reference to a static method
		
		Calculator cref = Calci::addSomething; // Method Reference
		cref.add(50, 70);
		
		// 2. Reference to non static method
		
		Calci calci = new Calci();
		Calculator cRef = calci::letsAdd;
		cRef.add(25, 45);
		
		// 3. Reference to a constructor
		
		Messenger mRef = Message::new;
		mRef.getMessage("Search the candle rather than cursing the darkness..!! ");
		
	}

}
