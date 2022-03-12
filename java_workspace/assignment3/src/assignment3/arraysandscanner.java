/**
 * 
 */
package assignment3;
//@author lloyd 
import java.util.Scanner;
class arraysandscanner {

	 
		public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name[]=new String[5];
		int marks[]=new int[5];
		int x,y,z;
		for(x=0;x<5;x++)
		{System.out.println("enter student name");name[x]= scanner.nextLine();}		
		for(y=0;y<5;y++) 
		{System.out.println("enter students marks for "+name[y]);marks[y]= scanner.nextInt();}
		for(z=0;z<5;z++)
		{System.out.println("name:   "+name[z]+"   marks  "+marks[z]);}
		}
		
}
