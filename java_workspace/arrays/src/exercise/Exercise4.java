/**
 * 
 */
package exercise;
 // * @author lloyd

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 { 
	static int sum = 0 , product = 1;
	public static void main(String[] args) {
      
	 Scanner scanner = new Scanner (System.in);
		System.out.println("enter the number of elements to sum , multiply and average");
		int number = scanner.nextInt();
		
		int [] array = new int[number];
		
		fillArray(array);
		
		printArray(array);
				
		sumArray(array);
		
		productArray(array);
		
		averageArray(array);

		//printArray(array);
}

    private static void fillArray(int[] array) {
		 Scanner scanner = new Scanner (System.in);
               for (int i=0;i<array.length;i++) {
            	   System.out.print(" enter number"+(i+1)+" : ");
            	   array[i]=scanner.nextInt();
               } System.out.println();         
	}
   private static void printArray(int[] array) {

	   System.out.println("your entries are: "+Arrays.toString(array));
	   
	}
    private static void sumArray(int[] array) {
      
       for (int i = 0 ; i < array.length ; i++) {
    	   sum+=array[i];
       }
		System.out.print(" sum : "+sum+" ");
	}
	private static void productArray(int[] array) {
	
	       for (int i = 0 ; i < array.length ; i++) {
	    	   product*=array[i];
	       }
		System.out.print("  product :  "+ product);
	}
	private static void averageArray(int[] array) {
		
	       for (int i = 0; i < array.length ; i++) {
	    	   sum+=array[i];
	       }
	     System.out.print("  Average :  "+sum/array.length);
	}
		
	
}
