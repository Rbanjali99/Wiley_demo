package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first statement");
		
		int arr[] = {1,2,3,4};
		try {
		System.out.println(arr[1]);
		String str = "Anjali";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(2));
		System.out.println(12/0);
		//exception occured here
		System.out.println(arr[4]);//will not run
		}
		catch(ArrayIndexOutOfBoundsException e) {//exception is the parent if all types of exeption
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		catch(StringIndexOutOfBoundsException e) {//exception is the parent if all types of exeption
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		catch(ArithmeticException e) {//exception is the parent if all types of exeption
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("another statement");

	}

}
