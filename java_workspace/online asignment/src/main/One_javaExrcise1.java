/**
 * 
 */
package main;

import java.lang.*;
import java.util.*;

public class One_javaExrcise1 {
 
	@SuppressWarnings({ "unused", "resource", "unlikely-arg-type" })
	public static void main(String[] args) {
      Scanner scanner = new  Scanner(System.in); 

     ArrayList <Character> vowel = new ArrayList<>();
	 vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
		 
	    ArrayList <Character> consonants = new ArrayList<>();
		consonants.add('b');consonants.add('c');consonants.add('d');consonants.add('f');consonants.add('g');consonants.add('h');
		consonants.add('j');consonants.add('k');consonants.add('l');consonants.add('m');consonants.add('n');consonants.add('p');
		consonants.add('q');consonants.add('r');consonants.add('s');consonants.add('t');consonants.add('v');consonants.add('w');
		consonants.add('x');consonants.add('y');consonants.add('z');
		while (true) {
		  System.out.println("enter the character to find if vowel or consonant");
		  char entry = scanner.next().charAt(0);
 		  entry = Character.toLowerCase(entry);

  		 

		  if (vowel.contains(entry)) {
			  entry = Character.toUpperCase(entry);
 			 System.out.println(entry+" is a vowel ");
		  }
		  else if (consonants.contains(entry)) {
			  entry = Character.toUpperCase(entry);
			  System.out.println(entry+ " is a consonant");
		  }
		  else {
			  System.out.println("Entry not an English alphabet");
		  }
		  
		 
		}		 
		  
	}

	private static boolean isNUmeric(String entry) {
		
		return entry != null && entry.matches("[0-9.]+");
		// TODO Auto-generated method stub
		}
	private static boolean isCharnumber( char entry) {
		int number = (int)(entry);
		return true;
	}
	
	
	
	
	
	
	
}
