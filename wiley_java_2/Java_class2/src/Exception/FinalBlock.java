package Exception;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			System.out.println("try block");
			System.out.println("wiley");
			System.out.println(10/0);
			System.exit(0);//this block will terminate
		}
	
		catch(Exception e) {
			System.out.println("catch block");
			
			try {
				System.out.println(10/0);
			}
			catch (Exception e1) {
				System.out.println(e1.getMessage());
				}
			System.out.println(e.getMessage());
			//System.exit(0);//finally will not execute
		}
		finally{
			System.out.println("Clone connection");
			
		}
		System.out.println("last statement");

}
}
