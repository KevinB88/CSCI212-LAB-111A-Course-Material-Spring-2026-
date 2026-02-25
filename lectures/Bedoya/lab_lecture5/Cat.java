package lab_lecture5;
/*
 * 'extends' is used in 'inheritance' between classes
 * Dog becomes a 'child' of 'Animal' (Animal is a parent of child) 
 * 
 */
public class Cat extends Animal{
	
	public Cat(String name) {
		super(name); 
		
		//'super' keyword calls the constructor of the parent class
		//implicitly storing the string name to an attribute of the Dog class
	}
	
	@Override
	public void speak() {
		System.out.println(this.getName() + " meows!");
	}
}
