package studentLogin;

import javax.swing.*;

import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;

	//initialize the database connection details
    static final String DB_URL = "jdbc:mariadb://127.0.0.1/student";
    static final String USER = "root";
    static final String PASS = "0220"; 	
	
	//initializes frame components
	JTextArea username,password,details;
	JLabel forusername,forpassword,title;
	JButton login;

	public Login()
	{
	 
		//set the frame attributes
		setVisible(true);
		setLayout(null);
		setResizable(true);
		setSize(500,500);
		
		//set the frame components
		title = new JLabel();
		title.setText("Login");
		title.setBounds(100, 10, 80, 20);
		
		forusername = new JLabel();
		forusername.setText("ADM NO:");
		forusername.setBounds(10, 40,80, 20);
		username = new JTextArea();
		username.setBounds(90, 40, 100, 20);

		forpassword = new JLabel();
		forpassword.setText("Password:");
		forpassword.setBounds(10, 70,80, 20);
		password = new JTextArea();
		password.setBounds(90, 70, 100, 20);
		
		login = new JButton("Login");
		login.setBounds(100, 100, 80, 20);
		//add actionlistener to login button
		login.addActionListener(this);
		
		details = new JTextArea();
		details.setBounds(130, 130, 200, 60);
		
		//add frame components to the frame
		add(title);
		add(forusername);
		add(username);
		add(forpassword); 
		add(password);
		add(login);
		add(details);
	}


	@Override
	public void actionPerformed(ActionEvent event) 
	{
	    //map an action to be performed when login button is pressed	
		if(event.getSource().equals(login))
		{  
			//get user input from the form and save the details in variables
			String USERNAME = username.getText();
			String PASSWORD = password.getText();
			
			//create connection to database
			Connection connect=null;
		    Statement stmt=null;
			
			try
			{
				connect = DriverManager.getConnection(DB_URL, USER,PASS);
				stmt = connect.createStatement();
				String sql = "Select * from studentDetails where ADMNO='"+USERNAME+"' and  PASSWORD='"+PASSWORD+"'";
                ResultSet result = stmt.executeQuery(sql);
                
                	while(result.next())
                	{
                		
                		
                		
                		details.setText("NAME: "+result.getString("NAME")+"\n\nADM NO: "+result.getString("ADMNO"));
                		
                		
                	}
                	
			}
			
			catch(Exception sqlex)
			{
				sqlex.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) 
	{
		
		new Login();

	}	


}
