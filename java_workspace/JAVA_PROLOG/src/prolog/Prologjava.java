
package prolog;
import java.util.*;
import org.jpl7.Atom;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.fli.*;

 
public class Prologjava {

//	public Prologjava() {
//		 
//	}

	public static void main(String[] args) {
	 
		
//		Query q1 = new Query(
//		"consult" , 
//		new Term[] 
//		{new Atom
//		("C:/Users/lloyd/Documents/lloyd/intelligent systems/lloyd tony katila/animals.pl")}
//				);
//		Map<String , Term> [] solutions = q1.allSolutions();
//		
//		for (int i = 0; i < solutions.length; i++) {
//			System.out.println(
//					solutions[i].get("go.")
//					);
//		}
		
//		System.out.println(
//			q1+ " "+ (q1.hasSolution() ? "success" : "fail")
//				);
 	
		
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
