package Collections;

import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hs = new HashSet<>();
//		Set<String> ts = new TreeSet<>();
//		
//		hs.add("Java");
//		hs.add("Java");
//		hs.add("Python");
//		hs.add("JavaScript");
//
//		ts.add("JAVA");
//		ts.add("JAVA");
//		ts.add("Pyhton");
//		ts.add("JAVAss");
//		
//		System.out.println(hs);
//		System.out.println(ts);
//		
		
//		TreeSet<String> ts = new TreeSet<>();
		
//		ts.add("a");
//		ts.add("b");
//		ts.add("h");
//		ts.add("a");
//		ts.add("d");
//		ts.add("x");
//		ts.add("z");
//		System.out.println(ts);  // arrange in oreders
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		System.out.println(ts.headSet("b"));//return all elemenst less tha b
//		// <obj
//		System.out.println(ts.tailSet("h"));//>=obj
//		System.out.println(ts.subSet("b","h"));// >=obj and <obj
//		System.out.println(ts.descendingSet());
//		
//		
//		TreeSet<Integer> ts = new TreeSet<>();
//		ts.add(1);
//		ts.add(12);
//		ts.add(15);
//		ts.add(21);
//		ts.add(1);
//		System.out.println(ts);
//		System.out.println(ts.last().compareTo(ts.first()));
//		System.out.println(ts.first().compareTo(ts.first()));
//		System.out.println(ts.first().compareTo(ts.last()));
//		
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("A");
		ts.add("a");
		System.out.println(ts);
		System.out.println(ts.first().compareTo(ts.last()));
		
	}

}
