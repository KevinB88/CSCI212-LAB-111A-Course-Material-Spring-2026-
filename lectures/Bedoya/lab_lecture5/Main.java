package lab_lecture5;

public class Main {

	public static void main(String[] args) {
		
//		Animal a1 = new Animal("generic animal"); 
//		a1.speak();
//		Cat cat1 = new Cat("Creamy"); 
//		cat1.speak(); 
//		System.out.println(cat1.getName());
		// This will work because dog has inherited the methods belonging to 
		// its parent class 'Animal' 
		
		Rectangle r1 = new Rectangle(); 
		
		System.out.println("Area: " + r1.computeArea()); 
		
		Square s1 = new Square(1); 
		
		System.out.println("Area: " + s1.computeArea()); 
		
		System.out.println("Diagonal across: " + s1.computeDiagonalAcross()); 
			
	}

}
