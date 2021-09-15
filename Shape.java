import java.awt.Graphics2D;

public interface Shape
{

    int getX();


    int getY();


    int getWidth();

    int getHeight();

    void paintShape(Graphics2D g2);
}
