/**
 * 
 */
package exercise;

import java.util.*;

// * @author lloyd

public class Exercise7 {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
         System.out.println("enter the number of digits to input");
         int arrSize = scanner.nextInt();
         int array [] = new int [arrSize];
          
	          for (int i = 0 ; i < array.length ; i++ ) {
	       	   System.out.print("enter number"+(i+1)+" : ");
	       	   array[i] = scanner.nextInt();
	          }
    int [] assign = new int [array.length];
    int j = 0 ;
    int k = array.length - 1 ;
		  for (int i = 0 ; i < array.length ; i++) {  
			   
			  //case odd
			  if (array[i] % 2 != 0) 
				  assign[j++] = array[i];
			  //case even
			  else  
				  assign[k--] = array[i];
		  
		  }  
		  
		copyArray(assign , array);
		 
		System.out.println(Arrays.toString(array));
		
		 
	}

	private static void copyArray(int[] assign, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = assign[i];
		    
        }
        
	}

}
