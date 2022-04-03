/**
 * 
 */
package data_structure;

import java.util.Arrays;
import java.util.Scanner;
// * @author lloyd
public class arrays {

	 static int Scores[],size_array;
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  System.out.println(" enter the size of the array");
		    size_array = scanner.nextInt();
		    Scores = new int [size_array];
		   
		   for (int i = 0 ; i < Scores.length ; i++) {
			 System.out.print(" Enter the marks"+(i+1) + " : " ); 
			  int user_input =  scanner.nextInt();
			  
			 Scores[i] += user_input;
		   }
		   System.out.println(Arrays.toString(Scores));
       
		   //
		   System.out.println("Enter the number to search in the array ");
		   int element_to_be_searched = scanner.nextInt();
		   
		   search_element( element_to_be_searched);
		   
		   

	}

	private static void search_element( int element_to_be_searched) {
  label1:	for  ( int i = 0; i < Scores.length ; i++) {
			if(element_to_be_searched == Scores[i] ) {
				System.out.println(" Element found ");
				break;
			}
			
			else if (element_to_be_searched != Scores[size_array - 1]  &&  i == size_array - 1) {
				System.out.println("element not found ");
				break;	
			}
			else  {
		        continue label1;		
			}
		}
		 
		
	}

}
