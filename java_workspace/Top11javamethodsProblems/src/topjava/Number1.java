/**
 * 
 */
package topjava;

 //* @author lloyd
import java.util.*; 
public class Number1 {
	static Scanner scanner = new Scanner (System.in);
    static int nums_user_array [];
    static int user_entry_numbers;
 	public static void main(String[] args) {
        System.out.println("enter the number of digits to key in: ");
         int user_total_digits = scanner.nextInt();
         nums_user_array  = new int [user_total_digits]; 
      for (int i = 0; i < nums_user_array.length; i++ ) {
 		 System.out.print(" enter number"+(i+1)+" : ");
 		 nums_user_array[i] = scanner.nextInt();
 		 }
 		System.out.println(Arrays.toString(nums_user_array));
 		System.out.println("  The max number is :"+findMaxArray( nums_user_array));
	}
 public static int findMaxArray( int  nums_user_array[] ) {
    int  maxInt =  nums_user_array[0];	
  	     for (int j =  0; j < nums_user_array.length ;j++ ) { 
			maxInt = nums_user_array[j] < maxInt ? maxInt : nums_user_array[j];
     }	    
	return  maxInt ;
  }
 
}
