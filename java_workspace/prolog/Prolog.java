import org.jpl7.Query;
import java.util.*;
import org.jpl7.JPL;
import org.jpl7.fli.qid_t;


@SuppressWarnings("unused")
public class Prolog {
    public static void main(String[] args) {
        
    	
    	
    	
    
    	try {
    		String s1 = "consult('./MINERALS.pl')";
        	Query q1 = new Query(s1);
        
        	System.out.println( s1 + ""+(q1.hasSolution() ? "success":"fail"  )+"");
        	
    		String go1 = "go.";
    		Query q2 = new Query(go1);
    		
    		System.out.println(	(q2.hasSolution() ) );	
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    	
			
//		}
    	
    	 
    	 
    }
}
