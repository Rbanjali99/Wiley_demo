package JavaClass2;

interface Bank{
	void account();
}
interface Bank1{
	void account();
}

interface ATM extends Bank,Bank1{
	void insertCard();
	void option();
	void enterPassword();
	
}
interface AA{
	void m1();
}

abstract class NewATM implements ATM,AA{

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceAbstraction extends NewATM{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("enter the card");
		
	}
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("select the card");
		
	}
	
	public void option() {
		// TODO Auto-generated method stub
		System.out.println("select option");
		
	}

}
