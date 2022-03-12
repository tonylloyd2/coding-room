/**
 * 
 */
package gui;

import javax.swing.Action;
import javax.swing.event.AncestorListener;

/**
 * @author lloyd
 *
 */
public abstract  class Okbutton implements AncestorListener{
	public void actionPerformed (Action e) {
       System.out.println("i am inevitable ");		
	}

}
