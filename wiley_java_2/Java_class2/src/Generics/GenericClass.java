package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		
//		Printer<Cat> printer = new Printer(new Cat());
//		printer.print();
		
//		Printer<Dog> printer1 = new Printer(new Dog());
//		printer1.print();
		
//		Printer<String> printer = new Printer("Anjali selected in BNY");
//		printer.print();
		
//		Printer<Integer> printer1 = new Printer(24);
//		printer1.print();
		
//		Printer<Double> printer2 = new Printer(27.35d);
//		printer2.print();
		
//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
		
//		shout("Take me to movie");
//		shout("Bring me necklace");
//		shout("Amount " ,20000);
//		shout(new Dog());
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(7);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);
		
	}
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
	
	private static <T , V> T shout(T shoutOUT, V ValtoBring) {
		System.out.println(shoutOUT + "...!!!");
		System.out.println(ValtoBring + "...!!!");
		return shoutOUT;
	}

}
