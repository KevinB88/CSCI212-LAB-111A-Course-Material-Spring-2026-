package lab_lecture_generics;

import java.util.*; 
// Iterator: 
// This is an object type that allows you to 
// traverse elements of a 'collection' one at a time 
// (without knowing how that collection is stored internally)

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); 
		list.add("A"); 
		list.add("B"); 
		list.add("C"); 
		list.add("D"); 
		
		Iterator<String> it = list.iterator(); 
		
		/*
		 * .hasNext() 
		 * this checks if there is a proceeding object
		 * in the collection 
		 * 
		 * in this case .hasNext() returns True 
		 * if there is indeed an object in memory that proceeds the previous 
		 * False otherwise. 
		 */
		
		while(it.hasNext()) {
			String value = it.next(); 
			// .next() moves the iterator forward 
			// but returns the object associated to the 
			// previous position
			
			/* example 
			 * it -> "A" 
			 * using .next()
			 * returns "A" 
			 * then moves the iterator to "B" 
			 * it -> "B" 
			 * 
			 */
			
			System.out.println(value); 
		}
		
	/*
	 * Why do we have iterators in the first place? 
	 * Not every data-structure supports conventional indexing. 
	 * This is a nice work around, iterators provide a universal 
	 * traversal mechanism. 
	 * 
	 */
			System.out.println(); 
		
	/*
	 * You have worked with iterators in the past already 
	 * (but implicitly) in particular using a "for each" loop 
	 * The for each loop internally uses iterators 
	 */
	
		for(String s : list) {
			System.out.println(s); 
		}
	
		
	}
}
