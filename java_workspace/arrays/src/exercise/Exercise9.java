
package exercise;
import java.util.*;
 // @author lloyd 
public class Exercise9 {
 
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the number of rows and columns");
	 		int rows = scanner.nextInt();
	 		int column = scanner.nextInt();
	 		int [][] array = new int [rows][column];
	 		int sum  ;
	 		float mean ;
	 		 for (int i = 0 ; i < rows; i++) {
	 			 for (int j = 0; j < column; j++) {
	 	          System.out.print("Enter number"+(j+1)+" for  column"+(j+1)+" and row"+(i+1)+" : ");
	 				array[i][j] = scanner.nextInt();  
	 			 }
	 		 }
	 		 System.out.println("you have entered ");
	     System.out.println(Arrays.deepToString(array));
	     System.out.println();
	 		 for (int i = 0 ; i < rows; i++) { 
	 			 int min = array[i][0] ;
	 			 int max = array[i][0];
	 			  sum = 0;
	 			  for (int j = 0; j < column; j++) {
	 				  //findind the max and min of rows
	 				max = array[i][j] < max ? max : array[i][j];
	 				min = array[i][j] > min ? min : array[i][j];
	 				//findind the  mean of rows using sum
	 				sum += array[i][j];

	 			 } mean =( float) (sum / column) ;
	 			  
	 			System.out.println("Row "+(i+1)+"  maximum  = "+max+ " minimum = "+min +"  mean = "+mean +" sum = "+sum);  
	 		 } 			 
	      System.out.println();
 			 for (int j = 0; j < column; j++) {
 				 int min = array[0][j] ;
	 			 int max = array[0][j];
	 			  sum = 0 ;
 				 for (int i = 0 ; i < rows; i++) { 
 					max = array[i][j] < max ? max : array[i][j];
 					min = array[i][j] > min ? min : array[i][j];
 					sum  += array[i][j];
	 	       }  
 				mean = ( float ) ( sum / rows ); 
 				 
 				System.out.println("Columns "+(j+1)+"  maximum  = "+max+ " minimum = "+min +"  mean = "+ mean+" sum = "+sum);  
	 } 
	    /*   int min = array[0] ;
	   int max = array[0] ;
	 for (int i = 1 ; i < array.length ; i++ ) {
		 max = array[i] < max ? max : array[i];
	     min = array[i] > min ? min : array[i];
	 }
	System.out.println("max : "+max +"\nmin : "+ min);*/
		}
 
	}
 

	
	
	
	
	
	
	
	
	
