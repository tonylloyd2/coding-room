/**
 * 
 */
package arrays;
import java.util.Scanner;

/**
 *REGNO: CCS/00033/020
 *NAME :STANLEY ODUOR
 */
public class STUDENTS {

	
	public static void main(String[] args) {
		Scanner keyIn= new Scanner(System.in);
     int []myFirstArray= new int[9];
      int i;
for(i=0;i<myFirstArray.length;i++) {
	System.out.println("Enter the value into the array"); 
	int value=keyIn.nextInt();
	myFirstArray[i]= value;
	System.out.println( "The value is" + " "+myFirstArray[i]);

}
	 

  }

}
