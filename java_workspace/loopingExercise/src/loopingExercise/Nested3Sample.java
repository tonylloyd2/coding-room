/**
 * 
 */
package loopingExercise;

import java.util.Scanner;

// * @author lloyd
public class Nested3Sample {

 
	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		   for(int i=1;i<=n;i++) {
		    	 for(int j = 1 ; j <= n-i ; j++ ) 
	        		 System.out.print(" ");
		    	 for(int k=1;k<=i-1;k++) 
		    		 System.out.print("*");
		    	 
		    	 
		     System.out.println(); 	 
		     }
	}

}
