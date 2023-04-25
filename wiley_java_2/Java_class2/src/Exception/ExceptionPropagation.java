package Exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}

	}
	public static void method1() throws Exception{
		System.out.println("coming inside method1");
		try {
		method2();
		}
		catch(Exception e1) {
			System.out.println("inside method1 " + e1.getMessage());
		}
		System.out.println("going from method1");//will never come to this block
	}
	
	public static void method2() throws Exception{
		System.out.println("coming inside method2");
		throw new Exception("Exception occured in method2");
		
	}

}
