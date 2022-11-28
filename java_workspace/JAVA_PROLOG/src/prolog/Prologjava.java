
package prolog;
import java.util.*;
import org.jpl7.Atom;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.fli.*;

 
public class Prologjava {


	public static void main(String[] args) {
	 

		
		String go = "consult"
				+ "('C:/Users/lloyd/Documents"
				+ "/lloyd/intelligent systems/"
				+ "lloyd tony katila/animals.pl')";
		Query q1 = new Query(go);
		
		System.out.println( 
		go +" " + (q1.hasSolution() ? "success" : "fail") );
		
		String go1 = "go.";
		Query q2 = new Query(go1);
		
		System.out.println(	(q2.hasSolution() ) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
