package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 > o2) {
			return -1;
		}
		else if(o1 < o2) {
			return 1;
		}
		else {
			return 0;
		}
//		return o2.compareTo(o1);
//		return o1.compareTo(o2);
	}
	
}

public class ComparableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ss = new TreeSet<Integer>(new MyClass());
				
		
		ss.add(4);
		ss.add(1);
		ss.add(2);
		ss.add(15);
		System.out.println(ss);
	}

}
