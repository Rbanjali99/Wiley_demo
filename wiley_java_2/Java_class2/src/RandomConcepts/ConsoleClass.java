package RandomConcepts;

import java.io.*;


public class ConsoleClass {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		if(console == null) {
			System.out.println("Console is not available");
			
			System.exit(1);
		}
		String name = console.readLine("What is yoour name");
		char[] password = console.readPassword("Enter you password");
		
		console.printf("Hello . %s\n", name);
		
		console.printf("Your password is : %s\n",new String(password));
		
		
		

	}

}
