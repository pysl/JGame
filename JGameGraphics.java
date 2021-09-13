import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JGameGraphics extends JPanel implements ActionListener{

	public int tickSpeed = 10;

	Timer timer = new Timer(tickSpeed, this);

	public JGameGraphics() {

		timer.start();
	}

/*
	public static void circle(int[] size, int[] position, int[] color) {
		Graphics2D.setColor(new Color(color[0], color[1], color[2]));
		Graphics2D.fillOval(position[0],position[1],size[0],size[1]);
	}
*/



	public void actionPerformed(ActionEvent e) {
		repaint();
	}


}