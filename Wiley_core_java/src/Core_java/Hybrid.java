package Core_java;

class Vehiclee{  //superclass
	public void tier() {
		System.out.println("have tires");
	}
}
class Carr extends Vehiclee {
	public void speed() {
		System.out.println("tier and speed of car");
	}
}
class Van1 extends Vehiclee{
	public void sensor() {
		System.out.println("tier and sensor in van");
	}
}
class Vannn extends Van1{
	public void horn() {
		System.out.println("horn and sensor both");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carr cc = new Carr();
		Van1 vn = new Van1();
		Vannn vnnn = new Vannn();
		cc.tier();
		cc.speed();
		vn.tier();
		vn.sensor();
		vnnn.tier();
		vnnn.sensor();
		
		vnnn.horn();
		

	}

}
