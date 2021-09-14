import java.util.*;
public class example {
	public static void main(String[] args) {
		Canvas.setCanvasColor(new Color(0,0,0));
		Canvas.setCanvasSize(800,800);
		Rectangle rect = new Rectangle(0,0,100,100);
		rect.fill();

	}
	public static void waitFor(int time) {
		try
		{
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static int randInt(int min, int max) {
    Random r = new Random();
    int randomNum = r.nextInt((max - min) + 1) + min;
    return randomNum;
	}
}