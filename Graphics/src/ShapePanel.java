import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ShapePanel extends JPanel {
	private List<Shape> shapes = new ArrayList<>();
	
	public ShapePanel() {
		addMouseListener(new MouseListener() {
			
			private boolean doCircle=false;

			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton()== e.BUTTON1) {
					if (doCircle) {
						add (new Circle( e.getX(), e.getY(), (int) (100 + Math.random()*100)));
					} else {
						add (new Rect( e.getX(), e.getY(), (int) (100 + Math.random()*100), (int) (100 + Math.random()*100)));
					}
					repaint();
				} else {
					doCircle = ! doCircle;
				}
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		for (Shape s: shapes) {
			s.draw(g);
		}		
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}

	
}
