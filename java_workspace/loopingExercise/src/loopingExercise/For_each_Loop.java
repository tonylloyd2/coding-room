/**
 * 
 */
package loopingExercise;

import java.util.Scanner;
import java.util.Arrays;
//* @author lloyd
 public class For_each_Loop {
 
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner =  new Scanner (System.in);
        //enter numbers 
        System.out.println("enter the number of digits to input");
        int arrSize = scanner.nextInt();
        int	sum = 0;
        int array [] = new int [arrSize];
		for (int i = 0; i < array.length ;i++) {
			System.out.print(" Enter number : " );
			array[i] = scanner.nextInt();	
		}
		//introducing the for each loop to sum up
		for(int x: array) {
			sum += x ; 
		}
	    
		System.out.print("your entry is : "+Arrays.toString(array));
		System.out.println(" summation = : "+sum);
	}

}
