//HIDE
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Text implements Shape
{
    private Color color = Color.BLACK;
    private JLabel label = new JLabel();
    private double x;
    private double y;
    private double xGrow;
    private double yGrow;

    /**
     * Constructs a text at a given location.
     * x is the leftmost x-position of the shape
     * y is the topmost y-position of the shape
     * message the text string
     */
    public Text(double x, double y, String message)
    {
        this.x = x;
        this.y = y;
        label.setText(message);
    }



    public int getX()
    {
        return (int) Math.round(x - xGrow) ;
    }

    public int getY()
    {
        return (int) Math.round(y - yGrow);
    }



    public int getWidth()
    {
        return (int) Math.round(label.getPreferredSize().getWidth() + 2 * xGrow);
    }

    public int getHeight()
    {
        return (int) Math.round(label.getPreferredSize().getHeight() + 2 * yGrow);
    }

    /**
     * Moves this text by a given amount.
     * dx is the amount by which to move in x-direction
     * dy is the amount by which to move in y-direction
     */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    /**
     * Resizes this text both horizontally and vertically.
     * dw is the amount by which to resize the width on each side
     * dh is the amount by which to resize the height on each side
     */
    public void grow(double dw, double dh)
    {
        xGrow += dw;
        yGrow += dh;
        Canvas.getInstance().repaint();
    }

    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    //draws text to screen
    public void draw()
    {
        Canvas.getInstance().show(this);
    }

    public String toString()
    {
        return "Text[x=" + getX() + ",y=" + getY() + ",message=" + label.getText() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        if (color != null)
        {
            label.setForeground(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
            Dimension dim = label.getPreferredSize();
            if (dim.width > 0 && dim.height > 0)
            {
                label.setBounds(0, 0, dim.width, dim.height);
                g2.translate(getX(), getY());
                g2.scale(getWidth() / dim.width, getHeight() / dim.height);
                label.paint(g2);
            }
        }
    }
}
