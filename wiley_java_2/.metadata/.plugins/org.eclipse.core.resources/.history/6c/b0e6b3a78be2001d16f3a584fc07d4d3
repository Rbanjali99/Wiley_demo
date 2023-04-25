package Exception;

class AgeNotValid extends Exception{
	public AgeNotValid(String message) {
		super(message);
	}
	public String getMessage() {
		return "this age is not valid";
	}
	public String toString() {
		return "not valid";
	}
}

public class CustomException {
	
	public static void getAge(int age) throws AgeNotValid{
		if (age > 18) {
			try {
			throw new AgeNotValid("age not valid");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
		else {
			System.out.println("age valid");
		}
	}

	public static void main(String[] args) throws AgeNotValid {
		// TODO Auto-generated method stub
		getAge(20);
	}

}
