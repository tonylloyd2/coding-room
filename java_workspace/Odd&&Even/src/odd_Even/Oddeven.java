package odd_Even;
// * @author lloyd
import java.util.*;
public class Oddeven {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("enter the number to determine the if odd or even");
//    double a=5;
//    double b=3;
//    double c=Math.sqrt(b*b+a*b);
//    System.out.println(c);
    long i=scanner.nextLong();
    while(i==0) {
    	System.out.println("invalid entry");
     char entry=(char)i;
     System.out.println(entry);
    	System.out.println("enter the number to determine the if odd or even");
         i=scanner.nextLong();
			     if(i%2==0 && i!=0) {
					System.out.println("the number is even");
				}	
				else if (i%2!=0) {
					System.out.println("the number is odd");
				}
				else if (i== 0){
			     System.out.println("enter the number to determine the if odd or even");
				}
	         }	
	}

}
