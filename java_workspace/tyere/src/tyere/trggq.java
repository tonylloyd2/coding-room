/**
 * 
 */
package tyere;

/**
 * @author lloyd
 *
 */
import java.util.Scanner;
public class trggq {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	 int num1,num2;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter number 1");
	 num1 = scan.nextInt();
	 System.out.println("enter number 2");
	 num2 = scan.nextInt();
	System.out.print(addnumbers(num1,num2));
	
	 
   }
	
	public static int addnumbers (int num1,int num2)
	{
	return  num1+num2;}
}





