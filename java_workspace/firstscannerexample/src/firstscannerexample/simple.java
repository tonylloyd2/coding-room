/**
 * 
 */
package firstscannerexample;
 import java.util.Scanner;
public class simple {
 
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("what is you name");
		 String name = scanner.nextLine();
		 System.out.println("how old are you");
		 int age = scanner.nextInt();
		 System.out.println("helloo "+name+ " you are "+age +" years old ");
		
         
	}

}
