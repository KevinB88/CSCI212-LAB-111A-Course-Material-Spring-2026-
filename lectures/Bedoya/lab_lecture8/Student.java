package lab_lecture8;

// We do not implement the Comparison interface 
// We will use 'lambdas' or 'lambda' functions for comparison operations
public class Student {
	//public by default 
	//(assuming you don't specify public/private)
	String name; 
	double gpa;
	
	Student(String name, double gpa){
		this.name = name;
		this.gpa = gpa;
	}
	
	public String toString() {
		return name + " " + gpa; 
	}
	
}
