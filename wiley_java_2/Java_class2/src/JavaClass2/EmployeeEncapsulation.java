package JavaClass2;

class Employee{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
}
class EmployeeImp1{
	public void show(Employee emp) {
		System.out.println("calling show function");
		System.out.println("Name: "+ emp.getName() + " age: "+ emp.getage());
	}
}

public class EmployeeEncapsulation {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setName("Wiley");
		emp.setage(15);
		
		EmployeeImp1 eimp1 = new EmployeeImp1();
		eimp1.show(emp);
		emp.setName("Anjali");
		emp.setage(22);
		
		EmployeeImp1 eimp2 = new EmployeeImp1();
		eimp2.show(emp);
	}
}
