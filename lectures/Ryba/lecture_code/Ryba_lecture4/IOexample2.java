package Ryba_lecture4;
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.nio.file.Paths; 


/* CSCI212 : Lecture #4
 * 2/4/26
 * 
 */

public class IOexample2 {
	
	public static void main(String[] args) throws FileNotFoundException{
		File filePath = Paths.get("output.txt").toFile();
		Scanner s = new Scanner(filePath); 
		
		// A better/more general alternative to the for loop (with fixed iteration count) -
		// - that professor Ryba defined in class. 
		while(s.hasNext()) {
			String x = s.next();
			System.out.println(x); 
		}
	
	}	
}
