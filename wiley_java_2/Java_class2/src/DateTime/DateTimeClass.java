package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		LocalDate myDate = LocalDate.now();
		
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.now();
		
		System.out.println(myTime);
		
		LocalDateTime myDateTime = LocalDateTime.now();
		
		System.out.println("Before formatting: " + myDateTime);
		
		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String moDateTime = myDateTime.format(myDateFormat);
		System.out.println("After formatting: " + moDateTime);
		
		myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("After formatting: " + myDateTime.format(myDateFormat));
		
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateStr = "01/04/2023";
		
		LocalDate date = LocalDate.parse(dateStr,Format);
		
		System.out.println(date);
	}

}
