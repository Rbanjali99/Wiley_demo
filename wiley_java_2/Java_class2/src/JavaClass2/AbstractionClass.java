package JavaClass2;

abstract class Test1{
	{
		System.out.println("Test1 instance block");
	}
	
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public static void main(String[] args) {
		System.out.println("main is possible inside abstract class");
		
		
	}
	public Test1() {
		System.out.println("Test1 constructor");
	}
	static{
		System.out.println("Test1 static block");
	}
	
}

class Test2 extends Test1{
	{
		System.out.println("Test2 instance block");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Test2 m1 class");
		
	}
	public Test2() {
		System.out.println("Test2 constructor");
	}
	static{
		System.out.println("Test2 static block");
	}
}

public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		
		t2.m1();
		t2.m2();
		Test1.main(args);

	}

}
