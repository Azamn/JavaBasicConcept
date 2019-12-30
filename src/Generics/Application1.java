package Generics;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object class is the grand class of all class
		
		Object object = new Object();
		String myvar = new String();
		object = myvar;
		 
		Employee emp = new Employee();
		Accountant acc1 = new Accountant();
		emp = acc1;
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		ArrayList<Accountant> accnt = new ArrayList<Accountant>();
		accnt.add(new Accountant());
		// employees = accnt;
		
		// here we use <?> generics it means any type of object or data is stored.
		
		ArrayList<?> employees1 = new ArrayList<>();
		ArrayList<Accountant> accnt1 = new ArrayList<Accountant>();
		employees1 = accnt1;
		
		//upper bound
		ArrayList<? extends Employee> employees2 = new ArrayList<>();
		ArrayList<Accountant> accnt2 = new ArrayList<Accountant>();
		employees2 = accnt2;
		
		//lower bound
		ArrayList<? super Employee> employees3 = new ArrayList<>();
		ArrayList<Object> accnt3 = new ArrayList<Object>();
		employees3 = accnt3;
			
		makeEmployeeWork(accnt);
	
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}

}
