import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class makeCircle extends Canvas implements ActionListener{
	public static int[] position = {0,0};
	public static int[] size = {100,100};
	public static int[] color = {0,0,0};
	public static int[] windowSize = {840,840};
	public static String title = "JGame Window";

	public int tickSpeed = 10;

	Timer timer = new Timer(tickSpeed, this);

	public makeCircle() {

		timer.start();
	}

	public static void main(String[] args) {




		JFrame frame = new JFrame(title);
		Canvas canvas = new makeCircle();
		canvas.setSize(windowSize[0],windowSize[1]);
		frame.add(canvas);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public void paint(Graphics g) {
		g.setColor(new Color(color[0],color[1],color[2]));
		g.fillOval(position[0],position[1],size[0],size[1]);
	}

	public void actionPerformed(ActionEvent e) {

	}
}