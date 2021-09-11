import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import SwingJFrameDemo.SwingJFrameDemo;

public class Update
{
    public static void main( String[] args )
    {
    	ActionListener actionlistener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
            	HelloWorld();
        	}
    	};


    	Button("Update", "button", 350/2, 200/2, 100,100, actionlistener);


    }
    public static void Button(String title, String buttonName, int x, int y, int width, int height, ActionListener actionlistener) {

    	JFrame frame = new JFrame(title);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);
        frame.setVisible(true);




        JButton button = new JButton(buttonName);
        button.setBounds(x,y, width, height);
        button.addActionListener(actionlistener);
        panel.add(button);
    }

    public static void HelloWorld() {
    	System.out.println("Hello World");
    }
}
