package lab_lecture2;

/*	CSCI212 [111A] Lab lecture #2	
 * 	Kevin Bedoya
 * 	Student.java
 */

public class Student {
	private String name;
	private String id; 
	private int age;
	private double GPA;
	
	public Student(String name, String id, int age, double GPA) {
		this.name = name;
		this.id = id;
		this.age = age; 
		this.GPA = GPA;
	}
	
	
	//Getter methods
	public String getName() {
		return this.name; 
	}
	
	public String getId() {
		return this.id; 
	}
	
	public int getAge() {
		return this.age; 
	}
	
	public double getGPA() {
		return this.GPA; 
	}
	//Getter methods 
	
	
	//Setter methods	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA; 
	}
	//Setter methods
}
