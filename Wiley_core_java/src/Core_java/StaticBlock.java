package Core_java;

public class StaticBlock {

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	public StaticBlock() {
		System.out.println("constructor block");
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();

	}

}
