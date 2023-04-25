package StringClasses;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		
		String title = "Java Developer";
		float salary = 2000.5389f;
		int age = 25;
//		System.out.println(salary);
		
//		System.out.format("%s has age %d and"
//				+ " salary %.2f",title,age,salary);
		List<String> techStack = Arrays.asList(
				"Essential Java",
				"Head First Java",
				"Java Design Pattern"
				);
		
		for(String book:techStack) {
			System.out.printf("%-30s - In Stock \n %n",book);
		}

	}

}
