/**
 * 
 */
package divisor;

import java.util.Scanner;

// * @author lloyd
 
public class Divisor {
 
	public static void main(String[] args) {
 
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			
			System.out.println("enter number to find the sum of its divisors");
			int num=scanner.nextInt();
		    int sum=0;
			for(int i=1;i<=num/2;i++) {
				if (num % i==0) {
					 sum+=i;
				   //System.out.print(i +" ");
					//System.out.println("sum of divisors :=   " +(sum+num));  
	                
				}
			}
		}
		
	 
	}

}
