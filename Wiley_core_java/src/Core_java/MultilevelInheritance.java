package Core_java;
class Vehicle{
	public void tier() {
		System.out.println("have 4 tires");
	}
}
class Car extends Vehicle {
	public void speed() {
		System.out.println("speed of car");
	}
}
class Smartcar extends Car{
	public void sensor() {
		System.out.println("sensor smartcar");
	}
}

public class MultilevelInheritance {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartcar sc = new Smartcar();
		sc.tier();
		sc.speed();
		sc.sensor();

	}

}
