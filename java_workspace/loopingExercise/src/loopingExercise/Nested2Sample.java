/**
 * 
 */
package loopingExercise;
// * @author lloyd

import java.util.Scanner;

public class Nested2Sample {
 
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("enter the symbol to be printed");
	     char cr=scanner.next().charAt(0);
	     System.out.println("enter number of times to print the symbol to be printed");
         int num=scanner.nextInt();
         for (int i = 1 ; i <= num ; i++) { 
        	 for(int j = num ; j <= num-i ; j++ ) 
        		 System.out.print(" ");
        	 
        	 for(int j=1 ;j <= 2*i-1 ; j++) 
        		 System.out.print(cr);
         
	     System.out.print("\n");
          }
	
	}

}
