/**
 * 
 */
package methods3;

import java.util.Scanner;
 
// * @author lloyd
 
public class Methods3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.print("enter your name  age :");
   System.out.println("my name is :"+ getName() + "\nI am "+getAge()+ " years ");
		
	}
	
	
	public static String getName() {
	 Scanner scanner = new Scanner(System.in);
	return scanner.nextLine();
		
		
	}
	public static int getAge() {
		 Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
			}
}
