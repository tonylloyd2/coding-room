package arrays;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  System.out.println(" enter the size of the array");
		   int size_array = scanner.nextInt();
		   int Scores [] = new int [size_array];
		   
		   for (int i = 0 ; i < Scores.length ; i++) {
			 System.out.print(" Enter the marks"+(i+1) + " : " ); 
			  int user_input =  scanner.nextInt();
			  
			  user_input = Scores[i];
		   }
	 		

	}

}
