package collectionMethods;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	String Department;
	
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		Department = department;
	}


	@Override
	public int compareTo(Employee o) {
		if(this.salary < o.salary)
			return -1;
		else if(this.salary > o.salary)
			return 1;
		return 0;
	}

	// toString method are used to sow the data with readable format

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", Department=" + Department + "]";
	}
	
	
	

}
