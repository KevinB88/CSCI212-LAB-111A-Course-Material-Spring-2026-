package lab_lecture_generics;

// Generics 
/*
 * 
 * In general, generics allow you to write classes & methods
 * where the type of data is a parameter, instead of being fixed
 */

import java.util.ArrayList; 

public class Main {

	public static void main(String[] args) {
		// Without any generics
		ArrayList list = new ArrayList<>(); 
		list.add("Hello"); 
		list.add(10); 
		
		// Using generics  (in this case the Generic is a String) 
		// The ArrayList is taking a String (data-type) as a parameter 
		// (the String is an object type) 
		ArrayList<String> words = new ArrayList<>(); 
		words.add("Hello"); 
		words.add("ect"); 
	
		// General syntax involved in Generics 
		// ClassName<Type> 
		
		Box<Integer> intBox = new Box<>(); 
		intBox.set(15);
		System.out.println(intBox.get()); 
		
		
		Box<Character> charBox = new Box<>(); 
		Box<Boolean> boolBox = new Box<>(); 
		
		
		AdvancedBox<Integer,String> pair = new AdvancedBox<>(1, "Word"); 
		System.out.println("First: " + pair.getFirst());
		System.out.println("Second: " + pair.getSecond());
	}

}
