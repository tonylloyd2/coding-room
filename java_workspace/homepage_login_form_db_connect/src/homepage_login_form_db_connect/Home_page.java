package homepage_login_form_db_connect;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Home_page extends JFrame {
	 static final int height = 100;	
	 static final int width = 100; 	
	 static final String  title = "login page !!!!";
	 JLabel username_label = new JLabel(" Enter  user name : ");
	 JTextArea username_entry = new JTextArea();
     JLabel user_password = new JLabel("Enter password");
     JTextField user_password_entry = new JTextField();
	 JButton submit_button = new JButton("Submit");
//	 JButton button1 = new JButton("try me");
//	 JButton button2 = new JButton("morbius");
	 ImageIcon  image = new ImageIcon("image_logo.jpg"); 

	 
	 public Home_page() {
 
    setTitle(title);
	setSize(width,height);
	setResizable(true);
    setIconImage(image.getImage());
	setLayout(new GridLayout(3,3));
	setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    
    
     
    add(username_label);
    add(username_entry);
    add(user_password);
    add(user_password_entry);
    add(submit_button);
		 
	}

}
