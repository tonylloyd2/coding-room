
package topjava;

import java.util.*;
 
//* @author lloyd
 
public class Number4 {
	static StringBuffer strbuffer = new StringBuffer();
    static Scanner scanner = new Scanner(System.in);
     @SuppressWarnings("unused")
	public static void main(String[] args) {
        

		System.out.print("Enter the number random words : ");
		int numberOfWords = scanner.nextInt();
		
		String array[] = new String[numberOfWords];
		
		System.out.print("Enter a text of  "+numberOfWords+ " random words : ");
		   
		for (int i = 0; i < array.length; i++) {//reading the text
			array[i] = scanner.next();
     			
		}
		for (int i = 0; i < array.length; i++) {//displaying the  text
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println(" enter minimum length of string to filter out entered words");
		int minLength = scanner.nextInt();
		
		filterWordsByLength(minLength ,array );
	}
	private static void  filterWordsByLength(int  minLength , String[] array) {
		String printedString ="" ;
		for (int i = 0; i < array.length; i++) {
			if( array[i].length() >= minLength ) {
         				 
               printedString += array[i] + " ";
  			}
 
		} 
 		
		 System.out.println(printedString );
	}


	
}
