package lab_lecture7;
//CSCI 212 Lab
//Kevin Bedoya 
//3/9/26

import java.util.ArrayList;
import java.util.Collections; 

public class Main {

	public static void main(String[] args) {
//		Book b = new Book("Percy Jackson", "Rick Riordan");
//		Book b2 = new Book("Recursion", "Blake Crouch"); 
//		
//		int comparisonReturn = b2.compareTo(b2); 
//		System.out.println(comparisonReturn);
		
		
		Film f1 = new Film("Whiplash", "Damien Chazelle");
		Film f2 = new Film("Star Wars", "George Lucas"); 
		Film f3 = new Film("Jurrasic Park", "Steven Spielberg");
		Film f4 = new Film("Pulp Fiction", "Quentin Tarantino");
		
		ArrayList<Film>films = new ArrayList<>(); 
		films.add(f1);
		films.add(f2);
		films.add(f3);
		films.add(f4);
		
		System.out.println("Before sorting: "); 
		
		for(Film film : films) {
			System.out.println(film.getFilmTitle()); 
		}
		
		System.out.println("After sorting: "); 
		
		Collections.sort(films);
		
		for(Film film : films) {
			System.out.println(film.getFilmTitle()); 
		}
		
		Film target = f3; 
		
		// To use this, the container type (e.g. the ArrayList<>)
		// must be sorted! 
		// binarySearch() is a faster method to find a target element 
		// in a container type. Faster than linearly searching! 
		int index = Collections.binarySearch(films, target);
		System.out.println(index); 
		
		//example of linear search
		index = 0; 
		for(int i = 0; i < films.size(); i++) {
			if(films.get(i).equals(target)) index = i; 
		}
		
		System.out.println(index); 
	}

}
