package Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
// @author lloyd
public class Exercise2 {
   static  Scanner scanner = new Scanner(System.in);
 
	public static void main(String[] args) throws InputMismatchException{
		 
       System.out.println("how many integers//max i 20");
       int UserNum = scanner.nextInt();
       
       while(UserNum > 20 || UserNum <= 0 ) {
    	   System.out.println("invalid number , try again");
           UserNum = scanner.nextInt();
           
       }
		int[] numbers = new int [UserNum];
        fillarrayOfIntegers(numbers);
		printarrayOfIntegers(numbers);
		
}

	private static void fillarrayOfIntegers(int[] numbers) {
 		
 		for (int i = 0 ; i < numbers.length ; i++ ) {
 			System.out.println("enter number"+(i+1));
 			 if(scanner.nextInt() > 20  ) {
 				 System.out.println(" number too big  try again");
 				 numbers[i] = scanner.nextInt(); 
 			 }
 			 else if( scanner.nextInt() <= 0) {
 				 System.out.println(" number too small try again");
 				 numbers[i] = scanner.nextInt(); 
 			 }
 			 else {
 				numbers[i] = scanner.nextInt();		 
 			 }
 		
 		}
		
		
	}

	private static void printarrayOfIntegers(int[] numbers) {
	
 		for (int i = 0 ;i < numbers.length; i++) {
 			System.out.print(numbers[i]+" ");
 		}
		System.out.println(Arrays.toString(numbers));
	}

	
	
	
	
	
	
	
	
}
