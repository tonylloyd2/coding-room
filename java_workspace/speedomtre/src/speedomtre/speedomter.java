/**
 * 
 */
package speedomtre;

/**
 * @author lloyd
 *
 */
public class speedomter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int  speedlimit=120;
		boolean drive=true;
		int initialvelocity=0;
		while (drive!=true) {
			initialvelocity++;
			if(initialvelocity>=speedlimit) { }
		continue;
		}
		System.out.println("Warning your speed limit has been exceeded!!!!");
	}

}
