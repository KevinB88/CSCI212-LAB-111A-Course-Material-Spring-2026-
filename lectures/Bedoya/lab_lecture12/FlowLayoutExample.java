package lab_lecture12;

import javax.swing.*; 
import java.awt.*; 

public class FlowLayoutExample {
	public static void main(String[] args) {
		
		
		// Layout example #2 : Flow Layout
		
		JFrame frame = new JFrame("Example layout"); 
		frame.setSize(750, 750);

	
		frame.setLayout(new FlowLayout());
		
		/*
		 * FlowLayout:
		 * when you add components, they are added from left to right 
		 * and they can wrap around if you run out of space on your frame 
		 */
		
		for(int i = 0; i < 20; i++) {
			frame.add(new Button("Button "+i)); 
		}
		
		
		//Always make sure to include the following!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
