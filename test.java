import java.awt.event.*;
import java.awt.*;

public class test extends Canvas{
	public static void main(String[] args) {

		makeCircle.main(new String[0]);
		makeCircle circle = new makeCircle();
	}

	public void actionPerformed(ActionEvent e) {

		int[] pos = {100,100};
		makeCircle.position = pos;
		System.out.println("test");

		pos[0]++;
		pos[1]++;
		makeCircle.position = pos;
		repaint();
	}
}