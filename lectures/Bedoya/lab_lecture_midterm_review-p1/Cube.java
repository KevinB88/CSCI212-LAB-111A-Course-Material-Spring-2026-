package lab_lecture_midterm_review;

public class Cube implements Calculator {
	/*
	 * 
	 * Example problem: 
	 * 
	 * attributes
	 * : dimensions (private double) 
	 * 
	 * constructor 
	 * 
	 * implements the volume method from Calculator.java
	 * : calculates the volume of the cube
	 */
	
	private double dims; 
	
	public Cube(double d) {
		dims = d; 
	}
	
	public double volume() {
		return dims * dims * dims; 
	}
}
