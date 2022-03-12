/**
 * 
 */
package loopingExercise;

import java.util.Scanner;

public class Loop {
 
	public static void main(String[] args) {
	int i=0;	
		// TODO Auto-generated method stub
   Scanner scanner= new Scanner(System.in);
   System.out.println("enter number");
   int num=scanner.nextInt();
   int max=num;
   int min=num;
   
   while(true) {
	   System.out.println("enter number");
	   num=scanner.nextInt();
	   if(num<0)
		   break;
	               //ALTERNAT CODE
	   if(num<min)  //min = num < min ? num : min; 
		  min=num;
	                 //ALTERNAT CODE
	   if (num>max)  //max= num > max ? num :max ;
		   max=num;
	     
	   
   }System.out.println("min:= "+min +" max: = "+max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
