/**
 * 
 */
package chelimo;

import java.util.Scanner;

/**
 * @author lloyd
 *
 */
public class SumDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		while (true) {
	      System.out.println("enter number to find the sum digit");
          int num=scanner.nextInt();
          int sum=0;
          while(num>0) {
        	  
        	  sum += num%10;
        	  num/= 10;
        }
        System.out.println("sum of the digits =  " +sum);   
	}

  }
}