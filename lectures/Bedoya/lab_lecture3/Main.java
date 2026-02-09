package lab_lecture3;

import java.util.Random;

// CSCI212 [111A] 
// 2/9/26 
// Kevin Bedoya

public class Main {

	public static void main(String[] args) {
		
		// A matrix of dimensions 3x3 (rows x columns) 
		int[][] M = {	//    0  1  2
				{2, 3, 5}, // 0: {2, 3, 5}
				{4, 5, 7}, // 1: {4, 5, 7}
				{6, 7, 9}  // 2: {6, 7, 9} 
		};
		
		// View practice quiz#2 for background on the "trace" function
		System.out.println("Tr(M): " + trace(M));
		
		int n = 10; 
		
		System.out.println(averageOfRandomNumbers(n));
	}
	
	public static int trace(int[][] A) {
		
		int trace = 0; 
		int n = A.length; 
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				 if(i == j) trace += A[i][j]; 
			}
		}
		
		return trace;  
	}
	
	public static double averageOfRandomNumbers(int n) {
		Random rng = new Random();
		double average = 0; 
		
		for(int i = 0; i < n; i++) {
			// Generate a random integer between 0 and 1 inclusive.
			average += rng.nextInt(2); 
			// In general, .nextInt(n), generates an integer between 0 and n-1
		}
		return average / n; 
	}

}
