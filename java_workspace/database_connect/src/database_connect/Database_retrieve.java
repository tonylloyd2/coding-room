package database_connect;
import java.sql.*;
import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;

@SuppressWarnings({ "unused", "serial" })
public class Database_retrieve  extends JFrame  {

  	final static String url = "jdbc:mariadb://localhost/Maseno";
    final static  String password = "0220";
    final static String username = "root"; 
    static String adm = "";
	static String name = ""; 
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		 
			try {
				 Scanner scanner = new Scanner(System.in);
				 JFrame frame = new JFrame();
				 
				 frame.setVisible(true);
				 frame.setSize(50,600);
				 frame.setResizable(true);
				 frame.setLayout(null);
				 frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				 JTextArea text = new JTextArea();
				 text.setBounds(100,100,300,500);
				 
				 
				 
			    Connection connect = DriverManager.getConnection(url,username,password);
			    Statement statement = connect.createStatement();
			    String query = "select * from Students";
			    ResultSet result = statement.executeQuery(query);
                    
			    while (result.next()) {
			    	//adm  += result.; 
			    	//name += result.;
			    	text.append(" Admission no : "+result.getString("Admission_no")+"\n");
				    text.append( "Name : "+result.getString("Name")+"\n\n");
			    	
			    	System.out.println("Adm_no  :  " +result.getString("Admission_no") +"  \n  Name  :  "+result.getString("Name"));
			   
			    	
			    }
			     text.setAlignmentX(CENTER_ALIGNMENT);
			     text.setAlignmentY(CENTER_ALIGNMENT);
				 frame.add(text);

			}
			catch(Exception e ) {
				e.printStackTrace();
			}
	}

}
