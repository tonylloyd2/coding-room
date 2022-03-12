/**
 * 
 */
package circle;

/**
 * @author lloyd
 *
 */
import java.awt.*;
import java.util.*;
public class Circle {
   
	Point center;
	double radius;
//
//	Circle (Point initialCenter , double initialRadius){
//		
//	}
//	
	double getPerimeter() {
		return 2 * Math.PI * radius ;
	}
	double getArea() {
		return 2 * Math.PI * radius * radius; 
	}
	void setRadius( double newRadius) {
		radius = newRadius;
	}
	void setCenter(Point newCenter) {
		center = newCenter;
	}



















}
