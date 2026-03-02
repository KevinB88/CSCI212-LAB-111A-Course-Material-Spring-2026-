package lab_lecture6b;

public class SubClass extends SuperClass{
	
	
	// Example of constructor overloading
	
	public SubClass(int num, String word) {
		
		// if the class inherits from another class
		// then the sub-class's constructor must call super() under the same
		// parameter types (in this case an int and a String) 
		super(num, word); 
	}
	
	public SubClass(int num, String word, Boolean bool) {
		super(num, word); 
	}

}
