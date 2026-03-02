package Ryba_lecture10;

// Lecture #10 3/2/26 (Code by professor Ryba) 
// Employee.java

// We will cover the meaning of 'implements Comparable<Employee>' next lecture! 
// This will allow us to make comparisons between Employee objects. 
public class Employee implements Comparable<Employee>{
	
	private String name; 
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
	
	public double weeklyPay() {
		return 100; 
	}
	
	@Override 
	public String toString() {
		return name + " earns " + weeklyPay(); 
	}
	
	public static void main(String[]args) {
		Employee people[] = new Employee[2]; 
		
		people[0] = new Employee("Arthur"); 
		people[1] = new Employee("Freddy"); 
		
		// Using a "for each" loop as a short-hand to iterate through a container type. 
		for (Employee e : people) {
			System.out.println(e); 
			//e prints relative to the toString() method
			//what should the expected output be for each print in the iteration?
		}
	}
	//Defining how comparisons are executed with respect to Employee objects.
	@Override
	public int compareTo(Employee o) {
		if (weeklyPay() > o.weeklyPay()) return 1; 
		if (weeklyPay() < o.weeklyPay()) return -1; 
		return 0;
	}

}
