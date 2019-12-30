
public class BalancedParanthesis {
	
	static class stack{
		int top = -1;
		char items[] = new char[100];
		
		void push(char x) {
			if(top == 99) {
				System.out.println("Stack is Full.");
			}else {
				items[++top] = x;
			}
		}
		
		char pop(){
			if(top == -1) {
				System.out.println("Stack is empty.");
				return 0;
			}else {
				char element = items[top];
				top--;
				return element;
			}
			
		}
		boolean isEmpty() {
			return(top == -1) ? true : false;
		}
	}
	
	// matching charachter
	
	static boolean isMatchingPair(char character1 , char character2) {
		if(character1 == '(' && character2 == ')')
			return true;
		else if(character1 == '{' && character2 == '}')
			return true;
		else if(character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}
	
	
	// Return true balance paranthesis or not
	
	static boolean areparanthesisBalanced(char exp[]) {
		stack st = new stack(); // object of stack class for access the stack
		
		// traverse the expression for matching paranthesis
		
		for(int i=0; i<exp.length; i++) {
			if(exp[i]=='{' || exp[i]== '(' || exp[i]=='[')
				st.push(exp[i]);
			if(exp[i]=='}' || exp[i]==')' || exp[i]==']') {
				if(st.isEmpty()) {
					return false;
				}
				
				else if(!isMatchingPair(st.pop(), exp[i])) {
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char exp[] = {'{','(',')','}','[',']'};
		if(areparanthesisBalanced(exp)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}

}
