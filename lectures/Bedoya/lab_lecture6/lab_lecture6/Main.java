package lab_lecture6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal animal1 = new Animal(); 
		
		//Runtime polymorphism
		
		//Dog is a sub-class (child) of Animal
	
//		Animal animal2 = new Dog(); 
//		animal2.makeSound();
		
		//Lion is a sub-class (child) of Animal
		
//		Animal animal3 = new Lion(); 
//		animal3.makeSound();
		
		
		// Hierarchy: species -> canine/feline -> fox/leopard
		
		Species species1 = new Feline(); 
		
//		Species fox = new Fox(); 
		
		Canine fox = new Fox(); 
		
		Species canine = new Canine(); 
		
		fox.makeSound();
		
		
	

	}

}
