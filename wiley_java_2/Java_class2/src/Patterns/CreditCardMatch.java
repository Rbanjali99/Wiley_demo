package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cardNumber = "4323-4564-3423-2321";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNumber);
		
		String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
		
		System.out.println(maskedCard);

	}

}
