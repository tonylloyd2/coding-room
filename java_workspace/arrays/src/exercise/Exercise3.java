package exercise;
import java.awt.*;
import java.util.*;
 
// @author lloyd
public class Exercise3 {
 
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
		 
       System.out.println("how many integers//max i 20");
       int UserNum = scanner.nextInt();
       
//       while(UserNum > 20 || UserNum <= 0 ) {
//    	   System.out.println("invalid number , try again");
//           UserNum = scanner.nextInt();
//           
//       }
		Point [] points = new Point [UserNum];
        fillarrayOfPoint(points);
		printarrayOfPoint(points);
		
}

	private static void printarrayOfPoint(Point [] points) {
 		Scanner scanner = new Scanner(System.in);
 		
 		for (int i = 0 ; i < points.length ; i++ ) {
 			System.out.println("("+points[i].x + " ," + points[i].y + " )");
 			//points[i] = scanner.nextInt();
 		}
		
		
	}

	private static void fillarrayOfPoint(Point [] points) {
	
		Scanner scanner = new Scanner (System.in);
		
		
 		for (int i = 0 ;i < points.length; i++) {
 			 System.out.println("enter x and y : for point"+(i+1)+" :"); 
 			points[i]= new Point(scanner.nextInt(), scanner.nextInt() );
 			//System.out.print(points[i]+" ");
 		}
		//System.out.println(Arrays.toString());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
