 
package loopingExercise;

import java.util.Scanner;

// * @author lloyd
public class NestedLoops {
 	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
     
     System.out.println("enter number of times");
     int num=scanner.nextInt();
     for(int i=1;i<=num;i++) {
    	 for(int j=1;j<=2*i;j++) {
    		 System.out.print(i+" ");
    	 }
    		System.out.println(); 
    		 
     } 
	}

}
