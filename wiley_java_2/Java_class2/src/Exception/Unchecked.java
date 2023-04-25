package Exception;
import java.util.ArrayList;
 
//custom exception creation
class StringNotFound extends RuntimeException{     
	
	public StringNotFound(String message) {
		super(message);
	}
	public String getMessage() {
		return "string is not present";
	}
}

public class Unchecked {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("venkat");
		students.add("anjali");
		students.add("rishav");
		if(!students.contains("ravi")) {
			try {
				throw new StringNotFound("This string not found");
				
			}
			catch(StringNotFound e){
				e.printStackTrace();
				e.getMessage();
			}
		}
		System.out.println("Message one");
		System.out.println("Message two");
		
	}
}
