/**
 * 
 */
package circle;
import java.awt.Point;
import java.util.Scanner;

//* @author lloyd 
 
public class Main{
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
 
		Circle c1 = new Circle();
		 c1.setCenter(new Point(1,2));
		 c1.setRadius(3.0);
//		System.out.print("enter points center: ");  
//		Point point = new Point ( scanner.nextInt(), scanner.nextInt() );
		
	//	c1.center = point;
		
		System.out.println("Area = "+c1.getArea()+"\n Perimeter = "+c1.getPerimeter());
		
	}

}
