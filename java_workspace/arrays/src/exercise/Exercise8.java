package exercise;
import java.util.*;
// * @author lloyd
public class Exercise8 {
 	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
 		System.out.println("Enter the number of rows and columns");
 		int rows = scanner.nextInt();
 		int column = scanner.nextInt();
 		
 		int [][] array  = new int [rows][column];
 		int sum ,sum1;
 		
 		for (int i = 0 ; i < rows; i++) {
 			 for (int j = 0; j < column; j++) {
 	          System.out.print("Enter number"+(j+1)+" for  column"+(j+1)+" and row"+(i+1)+" : ");
 				array[i][j] = scanner.nextInt();  
 			 }
 		 }
 	    //rows  = array.length;
 		//column = array[0].length;
 		
 		System.out.println(Arrays.deepToString(array));
 		 for (int i = 0 ; i < rows; i++) {
 			 sum = 0 ;
 			  for (int j = 0; j < column; j++) { 
 				sum += array[i][j];
 				}
 			  System.out.println("sum of row"+(i+1)+" = "+sum);
 		}
 		 
 		 
 		 System.out.println();
 		 for (int j = 0; j < column; j++) {
 			 sum1 = 0 ;
 		     for (int i = 0 ; i < rows; i++) {
		    	sum1 += array[i][j];
  			     }
			 System.out.println(" sum of column"+(j+1)+" = "+sum1);
 		}
 		 //Row-wise & Column-wise Sum
//         for (int i = 0; i < rows - 1; i++) {
//             int rSum = 0, cSum = 0;
//             for (int j = 0; j < column - 1; j++) {
//                 rSum += array[i][j];
//                 cSum += array[j][i];
//             }
//             array[i][column - 1] = rSum;
//             array[rows - 1][i] = cSum;
//         }	 
//         System.out.println("Array with Sum:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < column; j++) {
//                 System.out.print(array[i][j] + "\t");
//             }
//             System.out.println();
//         }
 		 
 		 
 		 
 		 
	}

}
