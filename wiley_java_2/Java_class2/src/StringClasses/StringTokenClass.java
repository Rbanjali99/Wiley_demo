package StringClasses;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StringTokenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StringBuffer> a = new ArrayList<>();
		ArrayList<StringBuilder> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
//		System.out.println(a);
//		System.out.println(a1);
//		System.out.println(a2);
//		a.add("Anjali haha");//cannot create
//		a1.add("Anjali haha");//cannot craete
		a2.add("Anjali haha");
		a2.add("hih");
//		System.out.println(a);
//		System.out.println(a1);
		System.out.println(a2);
		
		String input = "We,love,programming";
		StringTokenizer st = new StringTokenizer(input,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
		}
	}

}
