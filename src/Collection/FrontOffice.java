package Collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	 int empNo ;
		String empName ,job;
		double salary;
		
		Employee(int empNo, String empName, String job, double salary){
			this.empNo=empNo;
			this.empName=empName;
			this.job=job;
			this.salary=salary;
		}
		
		public String toString() {
			return empNo + " " + empName + " " + job + " " + salary ; 
		}
}
 
class Company{
	
	private Employee employee;
	private List<Employee>list;
	
	Company(){
		list=new ArrayList<Employee>();
	}
	
	public void createEmployee(int empNo, String empName, String job, double salary) {
		employee = new Employee(empNo, empName, job, salary);
		list.add(employee);
	}
	
	public List<Employee>getEmployeesList(){
		return list;
		
	}
}

public class FrontOffice {
	public static void main(String args[]) {
		
		Company company = new Company();
		company.createEmployee(101, "Azam", "Software Engineer", 25000);
		company.createEmployee(102, "Khalid", "Android Developer", 20000);
		company.createEmployee(103, "Manzar", "Data Analyst", 30000);
		
		List<Employee>list=company.getEmployeesList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
}
