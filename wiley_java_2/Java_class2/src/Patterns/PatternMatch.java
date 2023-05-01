package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		
//		Pattern pattern = Pattern.compile("agent \\d\\d\\d");
//		Matcher matcher = pattern.matcher("agent 0078");
		
//		Pattern pattern = Pattern.compile("agent \\d{3}")exactly 3 digits or not
				
//		Pattern pattern = Pattern.compile("^agent \\d{3,4}");//3digits or more
//		Matcher matcher = pattern.matcher("123agent 758345");
		
//		Pattern pattern = Pattern.compile("agent \\d{3,4}$");//3digits or more
//		Matcher matcher = pattern.matcher("123agent 758345");
		
//		Pattern pattern = Pattern.compile("^agent \\d{3,4}");//3digits or more
//		Matcher matcher = pattern.matcher("123agent 758345");
		
		Pattern pattern = Pattern.compile("^[a|A]gent ([0-9]{3,6})");//3digits or more
		Matcher matcher = pattern.matcher("Agent 7583775");
		
//		Pattern pattern = Pattern.compile("\\w? \\d{3,7}$");//3digits or more
//		Matcher matcher = pattern.matcher("agent 7583775");
		
		if(matcher.find()) {
			System.out.println("Group: " + matcher.group() );
			System.out.println("Group: " + matcher.group(0) );
			System.out.println("Group1: " + matcher.group(1) );
		}
		
		Pattern pattern1 = Pattern.compile("agent 007");
		Matcher matcher1 = pattern1.matcher("agent 007");
		
		Pattern pattern2 = Pattern.compile("\\S\\s");//(//s) gives whitespace
		Matcher matcher2 = pattern2.matcher("8 ");
		
		boolean found = matcher.find();
		boolean founddd = matcher.matches();
		boolean found1 = matcher1.matches();
		boolean found2 = matcher2.matches();
		
		System.out.println(found);
		System.out.println(founddd);
		System.out.println(found1);
		System.out.println(found2);

	}

}
