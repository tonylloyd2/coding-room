package loopingExercise;

import java.util.Scanner;

public class Nested4Sample {
	public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);
			int n=scanner.nextInt();
			   for(int i=1;i<=n;i++) {
			    	 for(int j = 1 ; j <= n-i ; j++ ) 
		        		 System.out.print(" ");
			    	 for(int k=1;k<=2*i-1;k++) 
			    		 System.out.print("*");
			    	 
			    	 
			     System.out.println(); 	 
			     }
		}
}
