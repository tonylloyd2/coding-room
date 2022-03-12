package studentLogin;

import javax.swing.*;

public class HomePage extends JFrame 
{
	private static final long serialVersionUID = 1L;
	JTextArea details;
	
	public HomePage(String username,String admno)
	{
		setSize(200,200);
		setVisible(true);
		setLayout(null);
        
        details = new JTextArea();
        details.setBounds(10, 10, 150, 60);
        details.setText("NAME:"+username+"\n\nADM NO:"+admno);
        
        
        
        add(details);
		
	}

	
}
