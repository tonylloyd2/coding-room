package studentLogin;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Register extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
//	final static String url = "jdbc:mariadb://localhost/Maseno";
////    final static  String password = "0220";
//    final static String username = "root"; 
	
	//initialize the database connection details
    final static String DB_URL = "jdbc:mariadb://localhost/student";
    static final String USER = "root";
    static final String PASS = "0220"; 	
	
	JTextArea admno,stuname,password;
	JLabel title,foradmno,forname,forpassword;
	JButton login;
	
	public Register() {
	
		 
			//set the frame attributes
			setVisible(true);
			setLayout(null);
			setResizable(true);
			setSize(500,500);
			
			//set the frame components
			title = new JLabel(" Register");
//			title.setText("Register");
			title.setBounds(100, 10, 80, 20);
			
			forname = new JLabel();
			forname.setText("Username");
			forname.setBounds(10, 40,80, 20);
			stuname = new JTextArea();
			stuname.setBounds(90, 40, 150, 20);
			
			foradmno = new JLabel();
			foradmno.setText("REG NO:");
			foradmno.setBounds(10, 70,80, 20);
			admno = new JTextArea();
			admno.setBounds(100, 70, 150, 20);

			forpassword = new JLabel();
			forpassword.setText("Password");
			forpassword.setBounds(10, 100,80, 20);
			password = new JTextArea();
			password.setBounds(90, 100, 150, 20);
			
			login = new JButton("Login");
			login.setBounds(100, 130, 80, 20);
			//add actionlistener to login button
			login.addActionListener(this);
			
			//add frame components to the frame
			add(title);
			add(forname);
			add(stuname);
			add(foradmno);
			add(admno);
			add(forpassword);
			add(password);
			add(login);		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
	
		if(event.getSource().equals(login))
		{
			//get user input from the form and save the details in variables
			String NAME = stuname.getText();
			String PASSWORD = password.getText();
			String ADMNO = admno.getText();
			
			//create connection to database
			Connection connect=null;
			Statement stmt=null;
			
			try
			{
				connect = DriverManager.getConnection(DB_URL, USER,PASS);
				stmt = connect.createStatement();
		        String sql = "INSERT INTO studentDetails VALUES ('"+admno.getText()+"','"+NAME+"','"+PASSWORD+"')";
		        stmt.executeUpdate(sql);
                System.out.println("Details inserted succesfully");
                
			}
			
			catch(Exception sqlex)
			{
				sqlex.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
	  new Register();     

	}	
	
}
