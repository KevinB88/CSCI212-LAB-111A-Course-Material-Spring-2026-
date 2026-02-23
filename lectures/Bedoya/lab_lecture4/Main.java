package lab_lecture4;

import java.util.ArrayList; 
import java.util.Collections; 

public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; //initializing all elements to 0 by default 
		int[] arr2 = {1, 2, 3}; // implicitly (fixed) sized to 3 
		
		// Integer is a "wrapper class"
		// treats the primitive integer as an object 
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		//ArrayLists are indexed beginning at 0 (just like standard arrays) 
		arrayList.add(1); //0 
		arrayList.add(2); //1
		arrayList.add(3); //2
		arrayList.add(4); //3 
		 
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " "); 
		}
		
		for(int i = 0; i < arrayList.size(); i++) {
			arrayList.set(i, 10 * arrayList.get(i));
		}
		
		System.out.println("After updating each element in the arrayList: ");
		
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " "); 
		}
		
		
		// This doesn't work! Will result in an error (compile time) 
//		ArrayList<int> arrayList = new ArrayList<>(); 
		
		System.out.println("Before .clear() : "+ arrayList.size());
		
		arrayList.clear(); 
		System.out.println("After .clear() : "+ arrayList.size());
		
		// This will result in a runtime error!
//		System.out.println(arrayList.get(0)); 
//		
		
		ArrayList<String>names = new ArrayList<>(); 
		
		names.add("George"); // 0
		names.add("Ulysses"); // 1
		names.add("Abraham"); // 2
		names.add("Harry"); // 3 
		names.add("John"); // 4 
		
		
		// .contains() 
		// Takes in the type of object that your array-list accepts
		// i.e. ArrayList<Type> arrayList
		// returns a boolean (true/false) depending if the object is contained within the list
		
		// .indexOf() 
		// Takes in the type of object that your array-list accepts
		// i.e. ArrayList<Type> arrayList
		// returns an integer (index) attributed to the position of the object of interest
		
		
		if(names.contains("Harry")) {
			System.out.println("Harry is in this array-list at index " + names.indexOf("Harry")); 
		} 
	
		
		// removing elements from an array-list
		names.remove("George"); 
//		names.remove(0);
		// .remove() 
		// This is an example of an overloaded method, meaning it can take more than one 
		// type of argument (in this case it can be a string or an integer) 
		// you can remove elements from the list either by its reference (e.g "George") or by
		// its index (e.g 0)
		// The positions of the array-list will update "dynamically" 
		
		System.out.println(names.get(0)); 
		
		// Lets declare a reference to names using names_copy, and let's see 
		// what happens if we sort!
		ArrayList<String>names_copy = names; 

		System.out.println("Before sorting: ");
		for(int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " "); 
		}
		System.out.println();
		
		// an example of a static method (a void method)
		// will update the names array-list 
		Collections.sort(names); 
		
		
		System.out.println("After sorting: ");
		for(int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " "); 
		}
		
		// Notice that even after declaring a copy of names (using names_copy)
		// names_copy still 'refers' to the same memory location of names 
		// Meaning that both names_copy and names will both be sorted! 
		System.out.println();
		for(int i = 0; i < names_copy.size(); i++) {
			System.out.print(names_copy.get(i) + " "); 
		}

		
	}

}
