public class example {
	public static void main(String[] args) {

		Canvas.setSize(350,275);


		Rectangle rect = new Rectangle(10,10,100,100);
		rect.setColor(new Color(0,255,0));
		rect.fill();

		Text text = new Text(100,150, "This is example text");
		text.draw();

		Ellipse ellipse = new Ellipse(200,10,100,100);
		ellipse.draw();
	}
}