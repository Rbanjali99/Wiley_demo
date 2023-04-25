package JavaClass2;

abstract class Vehicle{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicle(String color , int speed , int numWheels) {
		this.color = color;
		this.speed = speed;
		this.numWheels = numWheels;
		//abstract constructor
	}
	
	public abstract void move() ;//abstract method
	
}

class Car extends Vehicle{

	public Car(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	public void turn() {
		System.out.println("Turning left or right");
	}
	
}

public class CarAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
