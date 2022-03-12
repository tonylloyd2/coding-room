/**
 * 
 */
package arraylists;

import java.util.*;

// * @author lloyd
 
class Arraylist {
 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
  try (Scanner scanner = new Scanner (System.in)) {
	ArrayList <Integer> integers = new ArrayList<>();
	  ArrayList <String> string = new ArrayList<>();
	   
	  System.out.println("enter  the number of  integers to input");
	   int nums = scanner.nextInt();
	   
	  for ( int i = 0; i < nums ; i++) {
		  System.out.println("enter  number"+(i+1));
		  int num = scanner.nextInt();
		  
		  if (!integers.contains(num)) {
			 integers.add(num); 
		  }
	  }
	  Collections.sort(integers);
	 
	  System.out.println(integers);
}
catch (Exception e) {
	 e.printStackTrace();
}
  
  
  
  
  
	}

}
