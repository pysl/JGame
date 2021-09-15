import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Line implements Shape
{
    private Color color = Color.BLACK;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    /*
     * defines a line
     * x1 the x-coordinate of the starting point
     * y1 the y-coordinate of the starting point
     * x2 the x-coordinate of the ending point
     * y2 the y-coordinate of the ending point
     */
    public Line(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //returns values
    public int getX()
    {
        return (int) Math.round(Math.min(x1, x2));
    }

    public int getY()
    {
        return (int) Math.round(Math.min(y1, y2));
    }

    public int getWidth()
    {
        return (int) Math.round(Math.abs(x2 - x1));
    }

    public int getHeight()
    {
        return (int) Math.round(Math.abs(y2 - y1));
    }



    //moves the line by given amount
    public void translate(double dx, double dy)
    {
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
        Canvas.getInstance().repaint();
    }

    /**
     * Resizes this line both horizontally and vertically.
     * dw is the amount by which to resize the width
     * dw is the amount by which to resize the height
     */
    public void grow(double dw, double dh)
    {
        if (x1 <= x2)
        {
            x1 -= dw;
            x2 += dw;
        }
        else
        {
            x1 += dw;
            x2 -= dw;
        }
        if (y1 <= y2)
        {
            y1 -= dh;
            y2 += dh;
        }
        else
        {
            y1 += dh;
            y2 -= dh;
        }

        Canvas.getInstance().repaint();
    }

    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    //draws the line of the screen
    public void draw()
    {
        Canvas.getInstance().show(this);
    }

    public String toString()
    {
        return "Line[x1=" + x1 + ",y1=" + y1 + ",x2=" + x2 + ",y2=" + y2 + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        if (color != null)
        {
            g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
            Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line);
        }
    }
}
