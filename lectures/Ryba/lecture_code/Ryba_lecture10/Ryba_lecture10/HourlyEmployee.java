package Ryba_lecture10;

//Lecture #10 3/2/26 (Code by professor Ryba) 
//HourlyEmployee.java

public class HourlyEmployee extends Employee{
	
	private int hours; 
	private double rate; 
	
	public HourlyEmployee(String name, int hours, double rate) {
		super(name); 
		this.hours = hours; 
		this.rate = rate; 
	}
	
	@Override 
	public double weeklyPay() {
		return hours * rate; 
	}
}
