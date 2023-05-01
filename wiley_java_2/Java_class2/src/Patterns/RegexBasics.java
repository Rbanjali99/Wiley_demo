package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

	public static void main(String[] args) {
		
		String re = "\\d\\d\\D";
		String text = "99@";
//		"\\s\\S"; -> " a"
//		String re = "\\w\\w\\w\\w. ; (a-z A-Z, 0-9)
		
		Pattern pattern = Pattern.compile(re);
		
		Matcher matcher = pattern .matcher(text);
		
		Matcher mt = pattern.matcher(text);
		
		boolean res = mt.matches();
		System.out.println(res);
		
	}

}
