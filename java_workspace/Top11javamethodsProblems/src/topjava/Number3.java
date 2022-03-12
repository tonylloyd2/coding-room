/**
 * 
 */
package topjava;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

//@author lloyd
public class Number3 {
    //a programme to count the number of words in a string
	static Scanner scanner =  new Scanner (System.in);
	@SuppressWarnings("unused")
	public static void main(String[] args) {
     
		System.out.print("Enter a text : ");
		String string1 = scanner.nextLine();
		
		//calling the method
		System.out.println(" the number of words are : "+getWordsAmount3(string1));
	}
	//using charAt , loop and .length ,methods
	public static int getWordsAmount(String string1) {
     int sumTotalNumber = 1;
      for (int i = 0; i < string1.length() - 1; i++) {
		if( string1.charAt(i) ==' ' && string1.charAt(i + 1 ) != ' ' ) {
			sumTotalNumber++;
		}
	}    
	return sumTotalNumber; 
			
	}
	//using the split () function 
	public static int getWordsAmount2(String string1) {
		if ( string1 == null || string1.isEmpty()) {
			return 0;
		}
		String user_words [] = string1.split("\\s+");//the double slash and s+ is used to detect the spaces or additonal spaces
		
		return user_words.length;
	}
	//using stringToken class
	public static int getWordsAmount3(String string1) {
		if ( string1 == null || string1.isEmpty()) {
			return 0;
		}
		StringTokenizer token = new StringTokenizer(string1);
		
		return token.countTokens();	
	}



}
