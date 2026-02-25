package lab_lecture5;


public class Rectangle {
	
	// 'protected' ensures that the attributes of the parent class
	// are exclusively accessible within the parent AND its children 
	// (whatever inherits from the parent using the 'extends' keyword) 
	protected double length;
//	private double length; 
	protected double width; 
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width; 
	}
	
	public Rectangle() {
		this.length = 5; 
		this.width = 10;
	}
	
	public double computeArea() {
		return this.length * this.width; 
	}
	
	public double computePerimeter() {
		return 2 * this.length + 2 * width; 
	}
	
	public double computeDiagonalAcross() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
	}
	
	//this method can only be called within 'Rectangle', not interesting! 
	private void privateMethod() {
		System.out.println("Can only be used within Rectangle!");
	}
	
	
	// Can be used 'publicly' if 'protected' is used before the method declaration 
	protected void protectedMethod() {
		System.out.println("Can only be used within Rectangle AND its children");
	}
	

}
