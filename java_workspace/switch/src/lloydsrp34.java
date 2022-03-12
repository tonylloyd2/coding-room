/**
 * 
 */

/**
 * @author lloyd
 *
 */
import java.util.Scanner;
public abstract class lloydsrp34 {
 public static void main(String[] args) {
	try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter your weather conditions");
				String weather = scanner.nextLine();
				switch(weather) {
				case "cold":System.out.println("shade");
				break;
				case "hot":System.out.println("jacket");
				break;
				case "rainy":System.out.println("umbrella");
				break;
				default :
					System.out.println("invalid entry please try again");
				         
				 }
		   }
	}

}
