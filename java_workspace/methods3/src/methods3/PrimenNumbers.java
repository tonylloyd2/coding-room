package methods3;

import java.util.Scanner;

// * @author lloyd
public class PrimenNumbers {
 
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		while (true) {
		System.out.println("\n\nenter  starting point {space/return} then  ending point ");
		int start=scanner.nextInt(); int end=scanner.nextInt();
		System.out.print("the prime numbers between "+start+" and "+end+" are: \n");
        printPrimeBtwn(start, end);
        }		
		
	}
public static boolean isPrime(int n) {
 for (int i = 2; i<=n/2 ; i++) {
	 if(n % i == 0) 
		 //continue;
	 return false;
	  }
  return true;
	}
public static void printPrimeBtwn(int start ,int end) {
	int sum=0;
	for (int i=start; i <= end; i++) {
		if(isPrime(i)) {
			sum+=1;
			System.out.print(i+" ");
		}
    }
	System.out.println("\nthere are "+sum+" prime numbers between "+start+" and  "+end );
 }

	
}


