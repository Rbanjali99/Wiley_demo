package Core_java;

interface Person{
	public void getRole();
}

interface Student extends Person{
	
}

class Teacher implements Person{
	public void getRole() {
		System.out.println("Teaching");
	}
}

class ClassRoom extends Teacher implements Student{
	public void getRole() {
		System.out.println("classroom teaching");
	}
}


public class DiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		
		ClassRoom c = new ClassRoom();
		

	}

}
