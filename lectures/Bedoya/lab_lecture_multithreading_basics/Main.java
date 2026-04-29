package lab_lecture_multithreading_basics;

// Multithreading basics 
// In general multithreading is a significant topic in 
// CSCI 340 (Operating Systems) 


// Java programs by defaulyt run on a main thread 
// If you open a GUI, it runs on the "Event Dispatch Thread" 
// (EDT) 

// The problem that multithreading solves (at least in our context)
// Allowing the GUI to remain responsive while we commit to 
// background operations/computations, e.g. timing an animation:
// Setting up a timer, and determining how long a Swing animation runs for

// Single threaded computations are usually "blocked" by other computations
// in sequence 

import javax.swing.JFrame; 

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Single thread example"); 
		frame.setSize(300, 200);
		
		// JFrame.EXIT_ON_CLOSE : terminates the whole program 
		// not a good idea when you have additional computations that
		// immediately follow the GUI logic in your program!
		
		
		// JFrame.DISPOSE_ON_CLOSE : ONLY terminates the JFrame/GUI 
		// This allows you to keep the entire program running after
		// you have closed the GUI 
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true); 
		
		
		// Now we'll run the computation AFTER the window closes 
		// Implementing the "Thread" class 
		
		// in this example, our thread takes a lambda as a parameter
		Thread worker = new Thread(() -> {
			for(int i = 0; i <= 100; i+=2) {
				
				System.out.println(i); 
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace(); 
				}
			}
		}); 
		
		// The thread will only execute/begin working when you
		// indicate it so using the .start() method. 
		worker.start(); 
		while(frame.isDisplayable()) {
			// Example of a busy wait
		}
	}

}
