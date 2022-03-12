package exercise;

import java.util.Scanner;

 
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
		
     int UserNum,i;
     System.out.println("how many integers to input in an array??");
	 UserNum=scanner.nextInt();
	 int []array =new int[UserNum];
	 while(UserNum < 1 || UserNum > 20) {
		 System.out.println("invalid entry , try again ");
		   System.out.println("how many integers to input in an array??");
			 UserNum=scanner.nextInt();
			  array =new int[UserNum];
	    } 
		
		 for( i=0;i<UserNum;i++) {
			
			 System.out.println("enter number"+(i+1));
			    array[i]=scanner.nextInt();
			     
		    }
		for( i=0;i<UserNum;i++) {
			System.out.print(array[i]+" ");
          }
	 }
}
