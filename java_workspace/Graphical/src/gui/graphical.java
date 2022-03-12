/**
 * 
 */
package gui;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author lloyd
 *
 */
public class graphical  extends JFrame{
 
 static final int height = 100;	
 static final int width = 100; 	
 static final String  title = " lloyd tony GUI";
JLabel label = new JLabel("lloyd's  awesome!!!!!");
JLabel label2 = new JLabel("lloyd's 12345678!");
JButton button = new JButton("click me");
 JButton button1 = new JButton("try me");
JButton button2 = new JButton("morbius");
JTextField text = new JTextField();

//Okbutton submit = new Okbutton();


ImageIcon  image = new ImageIcon("image_logo.jpg"); 
graphical(){
		setTitle(title);
		setSize(width,height);
		setResizable(true);
		setLayout(new FlowLayout());
		setLayout(new GridLayout(3,3));
		label.setIcon(image);
	//	button.addActionListener((ActionListener) submit);
 		add(label);add(text);
		add(button);//add(label2);
        add(button1);
        add(button2);
        
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	    
	    setIconImage(image.getImage());
	    getContentPane().setBackground(new Color(13,220,60));
	}
	
 
}
