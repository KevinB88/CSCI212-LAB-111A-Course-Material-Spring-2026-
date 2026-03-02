package Ryba_lecture10;
import java.util.Arrays; 

//Lecture #10 3/2/26 (Code by professor Ryba) 
//Application.java


public class Application {
	public static void main(String[] args) {
		Employee people[] = new Employee[5]; 
		people[0] = new Employee("Arthur");
		people[1] = new SalariedEmployee("Freddy", 100000);
		people[2] = new SalariedEmployee("Max", 200000);
		people[3] = new HourlyEmployee("Jack", 40, 300); 
		people[4] = new HourlyEmployee("Kelly", 20, 15); 
		
		Arrays.sort(people); 
		
		for (Employee e : people) {
			System.out.println(e); 
		}		
	} 
}
