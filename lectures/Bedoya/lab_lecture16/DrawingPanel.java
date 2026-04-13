package lab_lecture16;

import java.awt.*; 
import javax.swing.*; 

public class DrawingPanel extends JPanel{
	/* We extend from JPanel because, JPanel is "drawable surface" (we can draw shapes on it)
	 * Also, it already integrates with Swing's rendering system. 
	 * 
	 */
	
	/*
	 * the paintComponent method:
	 * This tells swing that we'd like to draw shapes (e.g. referring to the Graphics object)
	 * Swing does:
	 * 
	 * #1) Controls rendering.
	 * #2) The JPanel provides a canvas for where the shapes will reside. 
	 * 
	 */
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		// This clears the screen before drawing again
		// Prevents "visual artifacts" (visual bugs) 
		
		// x, y, width, height 
		// the coordinates are with respect to the top-left corner of the shape being drawn
		
		
		// Examples of drawing rectangles
//		g.drawRect(0, 0, 100, 100); 
//		g.fillRect(200, 50, 100, 80);
		
		// Example of drawing a line
		// the input parameters are as follows: 
		// drawLine(x1, y1, x2, y2) 
		// the first point on screen (in pixel units) is (x1, y1) 
		// the second point on screen is (x2, y2) 
		
		// You can use this method call to obtain the coordinates for the center of your screen
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int centerX = center.x;
		int centerY = center.y;
		
//		g.drawLine(0, 0, centerX, centerY); 
		g.drawLine(0, 250, 500, 250);
		g.drawLine(250, 0, 250, 500);
	
//		g.drawOval(150, 150, 200, 200); 
		// x, y, width, height 
		
		int radius = 50; 
		// (250 - radius, 250 - radius) centers the circle at the origin (250, 250)
		// (2*radius, 2*radius) adjusts the radius of the circle 
		g.drawOval(250 - radius, 250 - radius, 2*radius, 2*radius); 
//		g.drawRect(250, 250, 200, 200);
		
//		g.drawLine(0, 0, 500, 500);
//		g.drawLine(0, 500, 500, 0);
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing shapes"); 
		DrawingPanel panel = new DrawingPanel(); 
		
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
