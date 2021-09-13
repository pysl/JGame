import java.awt.*;
import javax.swing.JFrame;

public class DrawingTest extends Canvas {
	public int x = 0;
	public int y = 0;
	public int width = 100;
	public int height = 100;
	public static int[] windowSize = {840,840};
	public static String title = "JGame Window";

	public static void main(String[] args) {




		JFrame frame = new JFrame(title);
		Canvas canvas = new DrawingTest();
		canvas.setSize(windowSize[0],windowSize[1]);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);


	}

	public void paint(Graphics g) {
		g.fillOval(x,y,width,height);
	}
}