package Array;
import java.util.Arrays;
import java.util.Scanner;
// @author lloyd
public class Exercise2 {
 
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
		 
       System.out.println("how many integers//max i 20");
       int UserNum = scanner.nextInt();
       
//       while(UserNum > 20 || UserNum <= 0 ) {
//    	   System.out.println("invalid number , try again");
//           UserNum = scanner.nextInt();
//           
//       }
		int[] numbers = new int [UserNum];
        fillarrayOfIntegers(numbers);
		printarrayOfIntegers(numbers);
		
}

	private static void printarrayOfIntegers(int[] numbers) {
 		Scanner scanner = new Scanner(System.in);
 		
 		for (int i = 0 ; i < numbers.length ; i++ ) {
 			System.out.println("enter number"+(i+1));
 			numbers[i] = scanner.nextInt();
 		}
		
		
	}

	private static void fillarrayOfIntegers(int[] numbers) {
	
 		for (int i = 0 ;i < numbers.length; i++) {
 			System.out.print(numbers[i]+" ");
 		}
		System.out.println(Arrays.toString(numbers));
	}

	
	
	
	
	
	
	
	
}
