/**
 * 
 */
package database_connect;

import java.sql.*;
import java.util.Scanner;

/**
 * @author lloyd
 */
class Mariadb_database {
    
   	 final static String url = "jdbc:mysql://localhost/Maseno";
     final static  String password = "0909";
     final static String username = "root"; 
     
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	try {
	    Connection connect = DriverManager.getConnection(url,username,password);
	    Statement statement = connect.createStatement();
	    System.out.println("enter your adm no and name separated by space");
	    String adm_no = scanner.nextLine();
	    String name = scanner.nextLine(); 
	    
	    String query = " insert into Students (Admission_no , Name) values ('"+adm_no+"','"+name+"')";
	    //execute the querry
	    statement.executeUpdate(query);
		System.out.println("details added successfuly");
	     connect.close();	
	}
     catch(Exception e) {
    	 e.printStackTrace();
     }
	
	
		}

}
