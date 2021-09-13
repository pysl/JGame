import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window
{
    public static void main( String[] args )
    {

    }




    public static void Button(String buttonName, int x, int y, int width, int height, ActionListener actionlistener, JPanel panel) {
        JButton button = new JButton(buttonName);
        button.setBounds(x,y, width, height);
        button.addActionListener(actionlistener);
        panel.add(button);
    }

    public static JPanel Window(String title, int width, int height) {
    	JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);
        frame.setVisible(true);
        return panel;

    }
}