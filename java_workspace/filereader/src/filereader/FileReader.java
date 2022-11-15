package filereader;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileReader;


public class FileReader {

	public static void main(String[] args) throws NoSuchElementException, FileNotFoundException,InputMismatchException{ 
	
		try {
			
			Scanner scanner = new Scanner(System.in);
		    Scanner scanner2 = new Scanner(System.in);

//		    Scanner filereader ;
//		    filereader = new Scanner(new FileReader("testfile.txt"));
		    Scanner inFile = new Scanner (  new FileReader ("testfile.txt"));
			System.out.println("the file contains \n########################################################");
			 
			while(filereader.hasNextLine() == true) {
			
			  System.out.println(filereader.nextLine());
//			  
			}
		    System.out.println("the above are the contents in the file \n########################################################");
	       
		    System.out.println("how many employees to add to the file??");
		    int user_number_entry = scanner2.nextInt();
		    PrintWriter write = new PrintWriter("testfile.txt");

		    for (int i = 0; i<user_number_entry;i++) {
		    
		    write.println("################################################################");
		    write.println("\n");
				write.println("Employee number"+(1+i));

			System.out.println("enter name of the employee");
			String name = scanner.nextLine();
			
			System.out.println("enter company name  for employee"+(i+1) +"  Name : = "+ name);
			String comName = scanner.nextLine();

			System.out.println("Enter country for employee"+(i+1) +"  Name : = "+ name +" of Company = "+comName);
		    String country = scanner.nextLine();

	        System.out.println("enter salary for employee"+(i+1) +"  Name : = "+ name +" of Company = "+comName);
	        String salary = scanner.nextLine();
	       
		   }
				 
				 write.close();
				 scanner.close();
			 filereader.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
		
	}

}
