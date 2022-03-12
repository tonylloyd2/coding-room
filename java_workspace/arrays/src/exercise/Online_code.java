package exercise;
 import java.util.*;
public class Online_code {
	 public static void main(String[] args) {    
	        int rows, cols, sumRow, sumCol;  
	        Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the number of rows and columns");
	 	     rows = scanner.nextInt();
	 		 cols = scanner.nextInt();
	            
	        //Initialize matrix a    
	        int a[][] =  new int[rows][cols]; 
	              
	          //Calculates number of rows and columns present in given matrix    
	          rows = a.length;    
	        cols = a[0].length;  
	        
	        //fill in the array  
	        for (int i = 0 ; i < rows; i++) {
	 			 for (int j = 0; j < cols; j++) {
	 	          System.out.print("Enter number"+(j+1)+" for  column"+(j+1)+" and row"+(i+1)+" : ");
	 				a[i][j] = scanner.nextInt();  
	 			 }
	 		 }
	        //print out the array
	        System.out.println();
	       System.out.println(Arrays.deepToString(a));
	       System.out.println();
	       
	        //Calculates sum of each row of given matrix    
	        for(int i = 0; i < rows; i++){    
	            sumRow = 0;    
	            for(int j = 0; j < cols; j++){    
	              sumRow += a[i][j];    
	            }    
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
	        }    
	            
	        //Calculates sum of each column of given matrix    
	        for(int i = 0; i < cols; i++){    
	            sumCol = 0;    
	            for(int j = 0; j < rows; j++){    
	              
	            	sumCol += a[j][i];    
	            }    
	            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
	        }    
	    }    

}
