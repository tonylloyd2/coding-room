package exercise;
 
// * @author lloyd
import java.util.*; 

public class  Exercise6 {

	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("enter the number of digits to input");
        int arrSize = scanner.nextInt();
        int array [] = new int [arrSize];
           
           for (int i = 0 ; i < array.length ; i++ ) {
        	   System.out.print("enter number"+(i+1)+" : ");
        	   array[i] = scanner.nextInt();
           }
	 System.out.println("you have entered :  "+Arrays.toString(array)+" numbers");
	      
	   int min = array[0] ;
	   int max = array[0] ;
	 
	 for (int i = 1 ; i < array.length ; i++ ) {
	 
		 max = array[i] < max ? max : array[i];
	     min = array[i] > min ? min : array[i];
       
	 }
	System.out.println("max : "+max +"\nmin : "+ min);

	}

}
