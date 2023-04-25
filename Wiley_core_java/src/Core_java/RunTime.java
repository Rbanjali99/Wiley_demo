package Core_java;

class Animals{
	public void eat() {
		System.out.println("eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}

class Lions extends Animals{
	public void eat() {
		System.out.println("eating lion");
	}
	public void roar() {
		System.out.println("roar");
	}
}
public class RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lions lions = new Lions();
		lions.eat();
		lions.roar();
		

	}

}
