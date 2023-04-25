package Core_java;

class Vehicle1{  //superclass
	public void tier() {
		System.out.println("have 4 tires");
	}
}
class Car1 extends Vehicle1 {
	public void speed() {
		System.out.println("speed of car");
	}
}
class Van extends Vehicle1{
	public void sensor() {
		System.out.println("sensor smartcar");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v = new Vehicle1();
		Van vn = new Van();
		Car1 c = new Car1();
		c.tier();
		vn.tier();
		vn.sensor();

	}

}
