package StringClasses;

public class StringProcess {

	public static void main(String[] args) {
		String s1 = "Wiley";
		String s2 = "Wiley";
		
		String s3 = new String("Wiley");//object created
		String s4 = new String("Wiley");
		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s3 == s4);
		
		String str = "I am a Java Developer";
		String str1 = "now";
		String ans = str + " " + str1;
		
		System.out.println(str.charAt(8));
		System.out.println(str.length());
		System.out.println(ans);
		
		System.out.println(str.replace('D', 'd'));//
		//do not replace permanently so we need to store
		str = str.replace('D', 'd');
		System.out.println(str);
		
		String st[] = str.split(" ");
		
		for(String s:st) {
			System.out.println(s);
		}
		
		String fname = "Anjali";
		String mname = "kumari";
		String lname = "hai";
		
		String fullname = fname.concat(" ").concat(mname).concat(" ").concat(lname);
		System.out.println(fullname);
		
		String input = "  Anjlai  ";//trim method
		System.out.println(input);
		System.out.println(input.trim());
		
		System.out.println(input.substring(2,4));
		System.out.println(input.toLowerCase());
	}

}
