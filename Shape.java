//HIDE
import java.awt.Graphics2D;

/**
 * A shape that can be drawn on a canvas.
 */
public interface Shape
{
    /**
     * Gets the leftmost x-position of the shape.
     * returns the leftmost x-position
     */
    int getX();

    /**
     * Gets the topmost y-position of the shape.
     * returns the topmost y-position
     */
    int getY();

    /**
     * Gets the width of the shape.
     * returns the width
     */
    int getWidth();

    /**
     * Gets the height of the shape.
     * returns the height
     */
    int getHeight();

    /**
     * Paints the shape
     *  g2 the graphics object
     */
    void paintShape(Graphics2D g2);
}
