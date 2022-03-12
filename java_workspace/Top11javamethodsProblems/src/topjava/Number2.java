
package topjava;

import java.util.Scanner;

//* @author lloyd
 
public class Number2 {
	static Scanner scanner = new Scanner(System.in); 
    
	@SuppressWarnings("unused")
	public static void main(String[] args) {
    
    System.out.print("enter height of rectengle and width separated by space  respectively: ");
    int height =  scanner.nextInt();
    int width = scanner.nextInt();
    
    PrintRectangle(height,width);
    
	}

	@SuppressWarnings("unused")
	private static void PrintRectangle( int height , int width) {	
		 for (int i = 1; i <= width; i++) {
           for (int j = 1 ; j <= height ; j++) {
        	   if(i == 1 || i == width || j == 1 || j == height ) {
        		   System.out.print(" *");
        	   }else {
        		   System.out.print(" ");
        	   }
           }System.out.println();
		 }
		
	}

}
