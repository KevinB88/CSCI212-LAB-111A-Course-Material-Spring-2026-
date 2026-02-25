package lab_lecture5;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name; 
	}
	
	public void speak() {
		System.out.println("This animal has spoken!");
	}
	
	public String getName() {
		return this.name; 
	}
}
