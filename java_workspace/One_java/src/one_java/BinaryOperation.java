/**
 * 
 */
package one_java;

import java.util.Scanner;
 //* @author lloyd
 
public class BinaryOperation {

 public static void main(String[] args) {
    // String [] letters = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","m","n","b","v","c","x","z"};
	Scanner scanner  = new Scanner(System.in);
	
	    while(true) {   
			System.out.println("type any letter to exit or press enter to continue");
			String user_responce  =  scanner.nextLine();

			if ( user_responce.isEmpty() == false){
				break;
	       }
		   else if ( user_responce.isEmpty() == true){    
			  
	       System.out.println("enter first Binary number");
	       String binary1 = scanner.next();
	       System.out.println("enter second Binary number");
	       String binary2 = scanner.next();
	       System.out.println("Enter the operation to be done");
	       char operation = scanner.next().charAt(0);
	       
	       //scanner.close();
	       
	       //convert binary string to decimal number
	       int num1Binary = Integer.parseInt(binary1 ,2);
	       int num2Binary = Integer.parseInt(binary2 ,2);       
	       
	       switch(operation) {
	       
	       case '+':
	    	 //add the decimal numbers
	           int SumofBinary = num1Binary + num2Binary;
	           
	           //convert sumOfBinary to string binary or just return with sop
	          String Sum = Integer.toBinaryString(SumofBinary);
	            System.out.println(Sum);
	          break;
	       case '-':
	      	 //add the decimal numbers
	           int subtract = num1Binary - num2Binary;
	           
	           //convert sumOfBinary to string binary or just return with sop
	          String SubtractionOfBinary = Integer.toBinaryString(subtract);
	            System.out.println( SubtractionOfBinary); 
	         break;
	       case '*':
	      	 //add the decimal numbers
	           int ProductOfBinary = num1Binary * num2Binary;
	           
	           //convert sumOfBinary to string binary or just return with sop
	          String Product = Integer.toBinaryString( ProductOfBinary);
	            System.out.println( Product);
	          break;
	       case '/':
	      	 //add the decimal numbers
	           int DivisonofBinary = num1Binary / num2Binary;
	           
	           //convert sumOfBinary to string binary or just return with sop
	          String Division = Integer.toBinaryString( DivisonofBinary);
	          System.out.println(Division);
		     }
		 }
	
       
        
	    }  
	       
	       
	       
	       
			
		
	}

}
