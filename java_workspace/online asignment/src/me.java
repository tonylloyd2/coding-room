/**
 * 
 */

/**
 * @author lloyd
 *
 */
import java.util.*;
public class me {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name");
		String name1=scanner.next();
		System.out.println("enter second name");
		String name2=scanner.next();
 		System.out.println("enter your age");
		int age=scanner.nextInt();
		String name= name1+" "+name2;
		String nameOut=sayName(name);
		int ageOut=sayAge(age);
		System.out.println("hello "+nameOut + " its good to have you back ");
		System.out.println("you are "+ageOut +" years old");
		
	}
    public static String sayName(String name) {   
          return name;
       }
    public static int sayAge( int age) {
    	  return age;
    }


}  

