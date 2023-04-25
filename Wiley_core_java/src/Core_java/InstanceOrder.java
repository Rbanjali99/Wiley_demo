package Core_java;

public class InstanceOrder {
	// instance block
	String name = "anjali";
	int age = 23;
	{	
		System.out.println("instance called");
	}
	//constructor block
	public InstanceOrder() {
		
		//from instance block we can call either using 
		//this keyword or simply calling variable also.
		
		System.out.println(name +" "+ this.age);
		
		System.out.println("constructore block");
		
	}
	//parameterized constructor block
	public InstanceOrder(int a, int b) {
		System.out.println("constructore block parameterized " + (a+b));
		
	}
	
	public static void main(String[] args) {
		
		InstanceOrder ior = new InstanceOrder();
		
		new InstanceOrder(2,3); //creating object
		
		
	}

}
