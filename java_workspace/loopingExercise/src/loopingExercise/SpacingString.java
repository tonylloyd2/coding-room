/**
 * 
 */
package loopingExercise;
 // * @author lloyd
import java.util.*;
public class SpacingString {
 
	public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
// while (true) {
	System.out.println("enter some string text to space");
	String text=scanner.nextLine(); //getting the string from the user
	
	//looping through the string
	for (int i=0;i<=text.length()-1;i++) {
		 System.out.print(text.charAt(i)+"  ");  //the charAt method is used to get the character index of the string
		                                        //need to be concatenateed with space
	      }
	
      }
}


