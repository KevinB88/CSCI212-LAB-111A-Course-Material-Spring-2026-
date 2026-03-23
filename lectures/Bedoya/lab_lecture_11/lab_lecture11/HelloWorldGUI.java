package lab_lecture11;

// we will be using Java Swing (GUI toolkit)
// GUI: Graphical User Interface 
import javax.swing.*;
import java.awt.event.*; 


public class HelloWorldGUI {
	
	/* Today we'll be looking at a new style of programming:
	 * namely, "event-driven programming" 
	 * main() -> method calls -> program terminates 
	 * 
	 */
	
	static int count = 0; 


    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame("Hello World"); 
    
    	
    	JButton button = new JButton("Click me!");
    	JLabel label = new JLabel("Count: 0");
    	
    	
    	button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			
    			count++; 
    			label.setText("Count: " + count); 
//    			System.out.println("Button was clicked!"); 
    		}
    		
    	});
    	
    	//adds a component (e.g the label) onto the frame

    	frame.setLayout(new java.awt.FlowLayout());
      	frame.add(label); 
    	frame.add(button); 
  
    	
    	//sets the size of the frame (in pixel dimensions)
    	frame.setSize(500, 500); 
    	
    	//specifies how we can close the frame
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	
    	// makes the frame visible
    	frame.setVisible(true); 
    	

    }
}

