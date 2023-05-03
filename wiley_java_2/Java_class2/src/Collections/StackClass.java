package Collections;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> ss = new Stack<>();
		
		
	/*	System.out.println(ss);
		System.out.println(ss.peek());
		System.out.println(ss.empty());
		System.out.println(ss.pop());
		System.out.println(ss);
		for (int i = 0 ; i < ss.size();i++) {
			System.out.println(ss.get(i));
		}*/
		
		ss.push(null);
		ss.push(null);
		ss.push(null);
		ss.push(null);
		
		System.out.println(ss);
		System.out.println(ss.pop());
	}

}
