package lab_lecture12;

import javax.swing.*; 

public class Main {

	public static void main(String[] args) {
		
		
		// Layout example #1 : Absolute positioning
		// We can position "components" onto the frame manually 
		// This will be relative to provided coordinates on the frame.
		// this is not recommended, because Java Swing can already do this
		// for you pretty well! 
		
		JFrame frame = new JFrame("Example layout"); 
		frame.setSize(500, 500);
		
		// The argument passed into the setLayout method
		// is a layout type, so without it, then we're able to 
		// position our components however we'd like to 
		frame.setLayout(null);
		JButton button = new JButton("Example button!"); 
		// x,y, width, height
		// (x,y) you think in terms of coordinate planes in 2-dimensions
		// the origin is at the top left pixel of your screen \
		button.setBounds(100, 100, 50, 50);
		
		frame.add(button); 
		//Always make sure to include the following!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
