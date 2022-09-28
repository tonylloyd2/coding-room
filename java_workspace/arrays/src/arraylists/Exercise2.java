/**
 * 
 */
package arraylists;
 // * @author lloyd
import java.util.*;
 public class Exercise2 {
    public static ArrayList<Integer> integer_user = new ArrayList<Integer>();
    public static Scanner scanner = new Scanner(System.in);
    public static int num_user, choice ,number_remove;
	public static void main(String[] args  ) {
     
		try {
		while ( true) {
    	  Display_menu();
    	  
    	choice = scanner.nextInt();
    	
    	if (choice == 1 ) {
    		add();
			
    	}
    	else if (choice == 2 ) {
    		remove();
    	}
        else if (choice == 3  && integer_user.isEmpty()) {
    		nullEntry();
    		//System.out.println("you have 0 entries in your database ");
    		
    	}
        else if (choice == 3 ) {
        	display();
			System.err.println("null");
			System.out.println(integer_user);
			 
        }
        else if ( choice > 4) {
			System.out.println("entry "+choice+" is out of options try again");
		}
        else if (choice == 4 ) {
    	  quit();
    	  break;
    	}
    	
		 }
	}
		catch ( InputMismatchException error) {
			System.out.println(" invalid input data  ::::  enter a number");
		}
	
 }
	 public static void Display_menu() {  
   	System.out.println("1 . Add");  
   	System.out.println("2 . Remove");  
   	System.out.println("3 . Display");
   	System.out.println("4 . Quit");
   	 }
	                                                   
	public static void add() {                            
 	   System.out.print("enter the integer to add : ");
	    num_user = scanner.nextInt();                
	   
	    integer_user.add(num_user);
	   
	    System.out.println(num_user+" has been added");
		
	}
	public static void remove() {
	System.out.print("Enter the number to remove : ");
	number_remove = scanner.nextInt();
	if  ( integer_user.contains(number_remove)) {
	 	integer_user.remove(Integer.valueOf(number_remove));
	System.out.println(number_remove+" has been removed ");
	}
	else {
		System.out.println("the number " +number_remove +" cannot be found in your database "
				+ " the numbers in your database are : "+ integer_user );
	}
	  
	}
    public static void display() {
    System.out.println(" the numbers in your database arer "+ integer_user );	
    }
    public static boolean nullEntry() {
       if (integer_user.isEmpty()) {
    	   return false;   
       }
    	
	return true;
    }
    public static void  quit() {
    	System.out.println("nice time //programme has been terminated");  	
    	
    }
}
