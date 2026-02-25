package lab_lecture5;

public class Square extends Rectangle{
	
	public Square(double length) {
		
		super(length, length); 
		protectedMethod(); 
	}
	
	@Override
	public double computeArea() {
		
		return Math.pow(length, 2);
	}
	
	
}
