package Core_java;

public class Constructor_types {
	
	public Constructor_types(int a , int b) {
		System.out.println("2 args passed " + (a+b));
		
	}
	public Constructor_types(float a , float b) {
		System.out.println("2 args passed " + (a+b));
		
	}
	
	public Constructor_types() {
		System.out.println("0 args passed ");
		
	}
	
	public void add() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_types ct = new Constructor_types();
		
		Constructor_types ctint = new Constructor_types(2,3);
		
		Constructor_types ctfloat = new Constructor_types(2.0f,3.9f);

	}

}
