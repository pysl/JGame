import javax.swing.JFrame;
import java.awt.*;

public class makeWindow extends JFrame {

	int[] circleSize = {100,100};
	int[] circlePos = {0,0};
	int[] circleColor = {0, 255, 255};
	JGameGraphics graphics = new JGameGraphics();

	//graphics.Circle(int[] circleSize,int[] circlePos,int[] circleColor);

	public makeWindow(int width, int height) {
		this.setSize(width,height);
		this.setResizable(false);
		this.setBackground(new Color(50,255,255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphics);
		this.setVisible(true);


	}
}