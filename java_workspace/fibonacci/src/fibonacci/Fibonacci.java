 /**
 * 
 */
package fibonacci;

 
import java.util.*;

/**
 * @author lloyd
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
try {
		while(true) { 
   long n3=0;
   long n2=1; 
   long n1=1;
//   long  [] num = new long[n3];
   System.out.println("enter the nth fibonacci");
   long nthF= scanner.nextInt();
     for (long i=1;i<=nthF-2;i++) {
    n3 = n1 + n2 ;
    n1=n2;
    n2=n3;

     }
     System.out.println("\n");
     if (nthF>2)
     System.out.println(" the  "  +nthF+ " fibonacci number is  "+n3);
     else if (nthF==1 || nthF == 2)
     System.out.println(" the  "+ nthF+ " fibonacci is  "+ (n3==0?1:n3)        );
     }
	}
   catch (InputMismatchException error) {
	   System.out.println("enter a numeric value");
   }

	}
}
