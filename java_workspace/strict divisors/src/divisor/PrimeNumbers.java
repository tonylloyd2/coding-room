/**
 * 
 */
package divisor;

import java.util.Scanner;

// * @author lloyd
public class PrimeNumbers {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
         int test=1;
         while (true) {
		System.out.println("number prime???");
		int primeNum=scanner.nextInt();
	 	for(int i=2;i<=primeNum/2;i++) {
//	if(primeNum==1||primeNum==2 ||primeNum==3) {																		 
//			System.out.println("prime");break;																 		
//				}														
//																			 
//	 	else if (primeNum%2==0 || primeNum%3==0 ) {
//	 		System.out.println("not prime");break;} 
//	 
//	 else {
//		 	System.out.println("prime");break;
//	 }
		 	if(primeNum%i==0) { 
			 		test+=i;
		 		System.out.println(test==1 ? "prime":"not prime");
			 		//System.out.println("not prime");
			 		break;}	    
	 	//else {
	 //		System.out.println("prime");break;
	 	
	 }
		
	}

	}}
