package lab_lecture8;

import java.util.ArrayList;
//import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student>students = new ArrayList<>();
		Student s1 = new Student("Michael", 3.6);
		Student s2 = new Student("George", 3.8); 
		Student s3 = new Student("Roger", 3.7); 
		Student s4 = new Student("Mike", 4.0); 
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		ArrayList<Student>students2 = new ArrayList<>();
		
		students2.add(s1);
		students2.add(s2);
		students2.add(s3);
		students2.add(s4);
		
		
		for(Student s : students) {
			System.out.println(s); 
		}
		
		System.out.println();
		
		
		// (a,b) are parameters to a 'lambda' function
		// the type is specified 
		// the attributes of a and b are accessed 
		// sorting is done relative to the gpa attribute of the student
		// You think of sort taking in a "function/method" as a argument
		students.sort((a,b) -> Double.compare(b.gpa, a.gpa));
		
		/*
		 * 	Reminder on what comparison methods return 
		 * 	compare(a,b)
		 * 	negative if a < b
		 *  positive if a > b
		 *  0 	     if a == b
		 * 
		 */
		
		
		for(Student s : students) {
			System.out.println(s); 
		}
		
		System.out.println(); 
		
			
		
		for(Student s : students2) {
			System.out.println(s); 
		}
		
		// Using lambdas to sort by name instead
		students2.sort((a,b) -> b.name.compareTo(a.name));
		

		System.out.println(); 
		
	
		for(Student s : students2) {
			System.out.println(s); 
		}
		

	}

}
