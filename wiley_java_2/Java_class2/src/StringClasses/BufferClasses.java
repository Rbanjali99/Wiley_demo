package StringClasses;

public class BufferClasses {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb.equals(sb2));
		
		String ss = "Wiley";
		System.out.println(ss.equals(sb1));
		System.out.println(ss.equals(sb1.toString()));
		
		sb.append(" Edge");
		System.out.println(sb);
		
		sb.insert(1, "hhh");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 1));
		System.out.println(sb.reverse());
		

	}

}
