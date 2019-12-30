package DataStructure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InStack instack = new InStack();
		if(!instack.isFull()) {
			instack.push(2);
			instack.push(4);
			instack.push(6);
			instack.push(8);
		}
		System.out.println(instack.pop());
		System.out.println(instack.pop());
	}

}
 