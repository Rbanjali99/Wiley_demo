package Core_java;

class Test{
	public static int add1(int v1,int v2) {
		int val = v1 + v2 ;
		return val;
	}
}

public class MethodType {
	
	public void sub(int v1 , int v2) {
		int val = v1 - v2;
		System.out.println("subtraction method in another instance method uses this keyword " + val );
	}
	
	//instance method
	public int add(int v1 , int v2) {
		int val = v1 + v2;
		this.sub(9, 5);
		return val;
		
	}
	
	//static method
	public static void mul(int v1 , int v2) {
		int val = v1 * v2;
		System.out.println("multiplication is static method " + val );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(5,2);
		MethodType m = new MethodType();
		Test t = new Test();
		int v = m.add(10,20);
		System.out.println("additon method " + v);
		System.out.println("from another class calling method " + t.add1(2,3));
	}

}
