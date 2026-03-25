package lab_lecture12;

import javax.swing.*;
import java.awt.*; 

public class GridLayoutExample {
	
	public static void main(String[] args) {
		
		
		// Layout example #2 : Flow Layout
		
		JFrame frame = new JFrame("Example layout"); 
		frame.setSize(750, 750);

	
		// The arguments of the GridLayout are rows (int) and cols (int)
		// components will be placed in (row, col) positions 
		frame.setLayout(new GridLayout(3,3));
		
		
		/*
		 * Grid Layout: will create a rows x cols dimension grid 
		 * components are added in order starting from the top left
		 * 
		 */
		for(int i = 0; i < 9; i++) {
			frame.add(new Button("Button "+i)); 
		}
		
		
		//Always make sure to include the following!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
