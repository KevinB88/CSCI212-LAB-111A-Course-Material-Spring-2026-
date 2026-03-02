package Ryba_lecture10;

//Lecture #10 3/2/26 (Code by professor Ryba) 
//SalariedEmployee.java

public class SalariedEmployee extends Employee{
	
	private double annualSalary; 
	
	public SalariedEmployee(String name, double salary) {
		super(name); 
		annualSalary = salary; 
	}
	
	@Override 
	public double weeklyPay() {
		return annualSalary / 52; 
	}
	
	public static void main(String[] args) {
		SalariedEmployee people[] = new SalariedEmployee[2]; 
		people[0] = new SalariedEmployee("Arthur", 1000); 
		people[1] = new SalariedEmployee("Freddy", 100000);
		
		for(SalariedEmployee e : people) {
			System.out.println(e);
		}
		
		System.out.println(); 
		
		//Would the following work? 
		//Yes! Because each SalariedEmployee is of type Employee! 
		for(Employee e : people) {
			System.out.println(e);
		}
		//And it will still compute weeklPay() as a SalariedEmployee
		//This is an example of dynamic dispatch. 
	
	}
}
