import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ellipse implements Shape
{
    private Color color = Color.BLACK;
    private boolean filled = false;
    private double x;
    private double y;
    private double width;
    private double height;

    //sets ellipse x,y,width, and height. this is what you call from other scripts
    public Ellipse(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //returns value
    public int getX()
    {
        return (int) Math.round(x);
    }


    public int getY()
    {
        return (int) Math.round(y);
    }


    public int getWidth()
    {
        return (int) Math.round(width);
    }


    public int getHeight()
    {
        return (int) Math.round(height);
    }


    //move ellipse over by dx and dy
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    //resizes ellipse by dw and dh
    public void grow(double dw, double dh)
    {
        width += 2 * dw;
        height += 2 * dh;
        x -= dw;
        y -= dh;
        Canvas.getInstance().repaint();
    }

    //sets color
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    //draws shape outline without filling it
    public void draw()
    {
        filled = false;
        Canvas.getInstance().show(this);
    }

    //draws shape filled in
    public void fill()
    {
        filled = true;
        Canvas.getInstance().show(this);
    }

    //turns ellipse obj into a string of values
    public String toString()
    {
        return "Ellipse[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(getX(), getY(),
                getWidth(), getHeight());
        g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
        if (filled)
        {
            g2.fill(ellipse);
        }
        else
        {
            g2.draw(ellipse);
        }
    }
}
