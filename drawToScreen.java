import java.awt.*;

public class drawToScreen {
	public static void main(String[] args) {
		int[] circleSize = {100,100};
		int[] circlePos = {0,0};
		int[] circleColor = {0, 255, 255};
		makeWindow MyFrame = new makeWindow(840, 840);
		JGameGraphics graphics = new JGameGraphics();
		graphics.Circle(circleSize,circlePos,circleColor);
	}
}