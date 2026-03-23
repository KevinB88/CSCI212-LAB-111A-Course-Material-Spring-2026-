package lab_lecture11;

import javax.swing.*; 
import java.awt.*; 

public class BorderLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout Example");
		
		// width x height (dimensions) (units are in pixels) 
		frame.setSize(500, 500); 
		frame.setLayout(new BorderLayout()); 
		
		JButton northButton = new JButton("North"); 
		JButton southButton = new JButton("South"); 
		JButton eastButton = new JButton("East"); 
		JButton westButton = new JButton("West"); 
		JButton centerButton = new JButton("Center"); 
		
//		JLabel northLabel = new JLabel("This is the Northern Label!"); 
		
		frame.add(northButton, BorderLayout.NORTH); 
//		frame.add(northLabel, BorderLayout.NORTH); 
		frame.add(southButton, BorderLayout.SOUTH); 
		frame.add(eastButton, BorderLayout.EAST); 
		frame.add(westButton, BorderLayout.WEST); 
		frame.add(centerButton, BorderLayout.CENTER); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		
	}

}
