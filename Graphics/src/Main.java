
import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static void main(String[] args) {
		Main m = new Main();
		m.setSize(800, 600);
		
		ShapePanel sp = new ShapePanel();
		m.setContentPane(sp);
		sp.add(new Circle(300,300,100));
		sp.add(new Rect(200,300,100,200));
		
		m.repaint();
		m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		m.setVisible(true);				
	}
}
