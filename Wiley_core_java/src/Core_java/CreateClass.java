package Core_java;

public class CreateClass implements Cloneable {

	int a = 20;

	public void add() {
		System.out.println("number adding");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {

		CreateClass cc = new CreateClass();
		
		//creating object with new keyword
		cc.add();
		System.out.println(cc);

		//////////////////////////////////
		
		//creating new object with newTnstance()
		try {
		Class c = Class.forName("Core_java.CreateClass");
		CreateClass ci = (CreateClass)c.newInstance();
		ci.add();
		System.out.println(ci);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		///////////////////////////////////
		// create object with object.clone method
		
		CreateClass objClone = (CreateClass)cc.clone();
		objClone.add();
		System.out.println(objClone);
	}

}
