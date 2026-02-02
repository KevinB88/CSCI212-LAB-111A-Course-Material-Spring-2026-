package lab_lecture2;

/*	CSCI212 [111A] Lab lecture #2	
 * 	Kevin Bedoya
 * 	Main.java
 */

public class Main {

	public static void main(String[] args) {
		
		
		//Example usages of setter/getter methods on Student objects
		//Recall that attempting to reference Student attributes, e.g. name, id, ect. -
		//- via the selection operator: "object.atrribute" will result in an error if -
		//- the attribute is private. In class, we mentioned that "hiding" away class - 
		//- attributes using the "private" keyword is an example of "encapsulation", 
		//- one of 4 core object oriented programming principles. 
		
		Student s1 = new Student("Marty", "100", 17, 3.5); 
		Student s2 = new Student("Jessica", "101", 19, 4.0); 
		Student s3 = new Student("Ferris", "102", 20, 3.8); 
		
		// An example of "getting"/retrieving a Student object's private attribute -
		// - using a getter method. Let's use the getter method to return a student's name.
		
		String s1Name = s1.getName();
		System.out.println("Student 1's name: " + s1Name);
		
		// An example of "setting"/updating a Student object's private attribute -
		// - using a setter method. Let's use the setter method to update a student's name. 
		
		System.out.println("Student 3's name before update: " + s3.getName()); 
		String s3UpdatedName = "Ferris Bueller"; 
		s3.setName(s3UpdatedName);
		System.out.println("Student 3's name after update: " + s3.getName()); 
		
		
		//Let's create an array of students, and print out the respective names
		Student[] studentArr = new Student[3]; 
		studentArr[0] = s1;
		studentArr[1] = s2; 
		studentArr[2] = s3; 
		studentNamePrint(studentArr);
	}
	
	public static void studentNamePrint(Student[] studentArr) {
		for(int i = 0; i < 3; i++) {
			System.out.println("Student: " + studentArr[i].getName()); 
		}
	}
}
