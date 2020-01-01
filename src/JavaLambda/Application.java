package JavaLambda;

public class Application {

	public static void main(String[] args) {
		
		Human tom = new Human();
//		tom.walk();
		
		Robot sophia = new Robot();
//		sophia.walk();
		
		// lambda is a block of code used to implement a method define to Functional Interface.
		// this is a lambda expression to run a single line of code using this ()-> function using Functional Interface and abstract method 
		walker(()-> System.out.println("Custom object walking..!"));
		
		// this is using when block of code is running in lambda function
		walkable ablockOfCode = ()-> {
			System.out.println("Something is walking..!");
			System.out.println("the object tripped..!");
		};
		
		walker(ablockOfCode);
		
		
		walkable hellovar = ()-> System.out.println("hello there..!");
		
		calculate sum =(a,b)-> a+b;
		hellovar.walk();
		System.out.println("Sum of two number is : "+sum.compute(4, 5));
		
		
		calculate nonZeroDivider = (a,b)-> {
			if(a == 0) {
				return 0;
			}
			return a/b;
		};
		System.out.println("Divider of two number : "+nonZeroDivider.compute(10, 5));
		
		
		MygenericInterface<String> reverseString = (s)-> {
			 String result = "";
			 for(int i = s.length()-1; i>=0; i--) {
				 result = result + s.charAt(i);
			 }
			 return result;
		};
		System.out.println("Reverse String is : "+ reverseString.work("lambda"));
		
		MygenericInterface<Integer> factorial = (n)-> {
			int fact = 1;
			for(int i = 1; i <= n; i++) {
				fact = fact*i;
			}
			return fact;
		};
		
		System.out.println("The factorial is :" + factorial.work(10));
		
	}
	
	public String reverse(String str) {
		String result = "";
		for(int i = str.length()-1; i>0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public int Factorial(int num) {
		int fact=1;
		for(int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public void sayHello() {
		System.out.println("Hello there..!");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int monZeroDivide(int arg1, int arg2) {
		if(arg1 == 0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public static void walker(walkable walkability) {
		walkability.walk();
	}
	
}

@FunctionalInterface
interface calculate{
	public int compute(int a, int b);
}

@FunctionalInterface
interface StringWorker{
	public String work(String str);
}

@FunctionalInterface
interface FactNum{
	public int factorial(int num);
}

// we can customize you code using make genericInyterface
interface MygenericInterface<T>{
	public T work(T t);
}
