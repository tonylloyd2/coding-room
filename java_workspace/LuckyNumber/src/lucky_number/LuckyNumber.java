/**
 * 
 */
package lucky_number;
// * @author lloyd
import java.util.*;
public class LuckyNumber {
     static Scanner scanner=new Scanner(System.in);
	 public static void main(String[] args) {
     System.out.println("lets play a game \n  i  have some 4-digit lucky numbers try to guess one of them \n"
     		+ " of course we'll discuss payments later ");
     int num1=scanner.nextInt(); 	
	if(((num1/1000)+(num1%1000)/100)==(((num1%100)/10)+ (num1%10)) && num1!=0 ) {
		System.out.println("you guessed right");
	}
	else if (num1%1000==0 && num1==0){
		System.out.println("the number  cannot be resolved to a 4-integer lets play a game  again try to guess");//234
	}
 	else /*if (((num1/1000)+(num1%1000)/100)!=(((num1%100)/10)+ (num1%10)) && num1!=0 )*/{
		System.out.println("sorry wrong guess try again pal");//234
	}
	while(num1==0 || num1%1000==0) {
	     System.out.println(" the number  cannot be resolved to a 4-integer or it a 0 \n lets play a game  again try to guess");
	       num1=scanner.nextInt(); 	
	 	if(  ((num1/1000)+(num1%1000)/100)==(((num1%100)/10)+ (num1%10)) && num1!=0) {
	 		System.out.println("you guessed right");
	 	}
	 	else {
	 		System.out.println("sorry wrong guess try again pal ");
	 	}
	}
    	
	}

}
