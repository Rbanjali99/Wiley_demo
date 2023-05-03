package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<>();
		
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		
		Enumeration<String> ev = vc.elements();
		
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		
		
		
	}

}
