package lab_lecture_generics;

import java.util.HashMap;
import java.util.ArrayList;
/*
 * 
 * HashMap<> : is a key-value pair based data structure 
 * HashMap<KeyType, ValueType> 
 * (examples of generics again!) 
 * 
 */

public class HashMapExample {
	public static void main(String[] args) {
		
		// first position: "key"
		// second position: "value"
		HashMap<String, Integer> grades = new HashMap<>(); 
		ArrayList<Integer> grades_array = new ArrayList<>(); 
		
		
		grades_array.add(100); 
		grades_array.add(95); 
		
		grades.put("John", 100); 
		System.out.println(grades.get("John")); 
		
		
		int [] nums = {10, 10, 10, 10, 4, 4, 4, 6, 1, 1}; 
		// the key : refers to the integer itself (from the array)
		// the value : is the corresponding frequency of that integer 
		// inside the array. 
		HashMap<Integer, Integer> frequency = new HashMap<>(); 
		
		for(int x : nums) {
			// this is a boolean method (returns T/F) 
			// checks if the element "x" (as a key) is contained in the 
			// HashMap 
			if(frequency.containsKey(x)) {
				frequency.put(x, frequency.get(x) + 1); 
			} else {
				frequency.put(x, 1); 
			}
		}
		
	/*
	  keySet()
	  Returns all keys inside the HashMap.
	  we iterate through every key and print:
	  key -> value
	 */
		for (Integer key : frequency.keySet()) {

			System.out.println(key + " -> " + frequency.get(key));
		}


		
	}
}
