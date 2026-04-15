package lab_lecture17;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.util.ArrayList;
import java.util.Random; 

// the triangle generation logic needs to be fixed!

public class WASDMovement {

	public static void main(String[] args) {
		JFrame frame = new JFrame("WASD movement"); 
		
		GamePanel panel = new GamePanel(); 
		frame.add(panel); 
		
	
		frame.setSize(500, 500); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
	}
}
	
class GamePanel extends JPanel{
	
	private int x = 200; 
	private int y = 200; 
	//This attribute determines the dimensions/size of the box
	private final int SIZE = 40; 
	//We can make exactly 10 unit movements around the frame 
	private final int STEP = 15; 
	
	// determines if the game is still active or not
	private boolean gameOver = false; 
	private ArrayList<Polygon> triangles = new ArrayList<>(); 
	private Random rand = new Random(); 
	
	
	public GamePanel() {
		setBackground(Color.WHITE); 
		setFocusable(true); 

		generateTriangles(6); 
		setupKeyBindings(); 
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		g.fillRect(x,y,SIZE,SIZE); 
		
		g.setColor(Color.RED); 
		for(Polygon t : triangles) {
			g.fillPolygon(t); 
		}
		
		if(gameOver) {
			g.setColor(Color.BLUE); 
			g.drawString("GAME OVER", getWidth()/2 - 40, getHeight()/2);
		}
	}
	
	// Obstacle logic
	
	private void generateTriangles(int count) {
	    triangles.clear();

	    int w = getWidth();
	    int h = getHeight();

	    for (int i = 0; i < count; i++) {
	        int baseX = rand.nextInt(Math.max(1, w - 40));
	        int baseY = rand.nextInt(Math.max(1, h - 40));

	        int[] xs = {baseX, baseX + 30, baseX + 15};
	        int[] ys = {baseY, baseY + 30, baseY - 30};

	        triangles.add(new Polygon(xs, ys, 3));
	    }

	    repaint();
	}
	
	private void checkCollision() {
		Rectangle player = new Rectangle(x, y, SIZE, SIZE); 
		
		for(Polygon t : triangles) {
			if(t.intersects(player)) {
				gameOver = true;
				break; 
			}
		}
	}
	
	
	private void setupKeyBindings() {
		
		InputMap im = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); 
		ActionMap am = getActionMap(); 
		
		//W 
		im.put(KeyStroke.getKeyStroke("W"), "up");
		am.put("up", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				y = Math.max(0, y - STEP);
				checkCollision(); 
				// update/repaint the frame 
				repaint(); 
			}
		});
		
		//S 
		im.put(KeyStroke.getKeyStroke("S"), "down");
		am.put("down", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				y = Math.min(getHeight() - SIZE, y + STEP); 
				checkCollision(); 
				// update/repaint the frame 
				repaint(); 
			}
		});
		
		//A
		im.put(KeyStroke.getKeyStroke("A"), "left");
		am.put("left", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				x = Math.max(0, x - STEP); 
				checkCollision(); 
				// update/repaint the frame 
				repaint(); 
			}
		});
		
		//D
		im.put(KeyStroke.getKeyStroke("D"), "right");
		am.put("right", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				x = Math.min(getWidth() - SIZE, x + STEP);
				checkCollision(); 
				// update/repaint the frame 
				repaint(); 
			}
		});
		
	}
	
}
