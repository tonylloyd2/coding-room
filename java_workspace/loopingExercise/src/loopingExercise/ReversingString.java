/**
 * 
 */
package loopingExercise;

import java.util.Scanner;

/**
 * @author lloyd
 *
 */
public class ReversingString {
 	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
         String reverse="";
			System.out.println("enter some string text to reverse");
			String text=scanner.nextLine(); //getting the string from the user
			for (int i=text.length()-1;i>=0;i--) {// i starts at the last character to the first 
				//method one
//				System.out.print(text.charAt(i)+"");
				//method two
				reverse+=text.charAt(i);
				
			}
			System.out.println(reverse);
 	
 	      
 	
 	}

}
