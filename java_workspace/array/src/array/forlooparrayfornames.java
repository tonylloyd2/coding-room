 package array;
 import java.util.Scanner;
public class forlooparrayfornames {
 
	public static void main(String[] args) {
String names[]=  new String[5];	
Scanner scanner=new Scanner(System.in);
int i,y;
   for(i=0;i<5;i++) 
   { 
	 System.out.println("enter name  ");
	 names[i]=scanner.nextLine();
   }
   for (y=0;y<5;y++)
      {
	   
		System.out.println(names[y]);
		names[y]=scanner.nextLine();
      }
	   
	   
 	}

}
