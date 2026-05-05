package lab_lecture_generics;

// So in this case "T" is a placeholder for a data-type in the future 
// All generics are object types (they cannot be primitives, i.e. 
// int, char, boolean, ect)
public class Box <T>{
	private T value; 
	
	public void set(T value) {
		this.value = value; 
	}
	
	public T get() {
		return value; 
	}

}
