package Ryba_lecture4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.nio.file.Paths; 

/* CSCI212 : Lecture #4
 * 2/4/26
 * To compile & execute this code in the terminal: 
 * 1. Go to the Package Explorer -> go to the package containing this code (Ryba_lecture4)
 * 2. Right click either IOexample1.java or IOexample2.java -> Show In -> Terminal
 * 3. From within the terminal write in the following commands: 
 * 3a. (to compile) : javac Ryba_lecture4/IOexample1.java Ryba_lecture4/IOexample2.java
 * 3b. (to run) : java Ryba_lecture4/IOexample1 (after running IOexample2, you should run IOexample2)
 */

public class IOexample1 {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(System.in);
		File filePath = Paths.get("output.txt").toFile();
		PrintWriter  p = new PrintWriter(filePath); 
		System.out.println("Input 10 words into the console: "); 
	
		/* Each word you enter must be separated by spaces! 
		 * e.g. Red Yellow Blue Silver ... 
		 * 
		 * 
		 */
		
		String words[] = new String[10]; 
		
		// In lecture, professor Ryba iterated from i = 1; i <= 10 
		// The only difference: we'd need to write words[i-1] within the loop
		// (indexing from 0) 
		
		//Storing 10 words into a words array of String objects
		for(int i = 0; i < 10; i++) {
			words[i] = s.next(); 
		}
		
		
		// This loop iteratively stores words that don't contain "e" to "output.txt" 
		for(int i = 0; i < 10; i++) {
			if(words[i] != null && words[i].contains("e")) {
				p.println(words[i]); 
				System.out.println(words[i]); 
			}
		}
		
		// Closing the scanner (s) and the print writer (p). 
		s.close();
		p.close(); 
		
	}

}
