package Collections;
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("n");
		al.add("j");
		al.add("a");
//		al.add('l');
//		al.add(1+3);
//		al.add(3.332);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.contains("n"));
		System.out.println(al.indexOf("a"));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("a"));
		System.out.println(al.lastIndexOf("n"));
		System.out.println(al.size());
		
		

	}

}
