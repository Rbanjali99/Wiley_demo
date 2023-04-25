package Core_java;

public class VarScope {
	int val = 50;
	int val1 = 11;
	int val2 = 5;
	int ins = 20;
	static String name = "Anjali";
	
	public void sum() {
		
		System.out.println("sum is " + (this.val1 + this.val2));
	}
	
	public static void main(String[] args) {
		int loc = 10;
		
		VarScope vso = new VarScope();
		
		System.out.println("local variable is " + loc);
		System.out.println("instance variable is " + vso.ins);
		System.out.println("static variable is " + name);
		
		vso.sum();//we need to call non static function or variables via object
		
		System.out.println("varcoe instance vaiable is " + vso.val);
		
	}

}
