package SerializableConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("books.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book b = (Book) ois.readObject();
			System.out.println("Book Code: " + b.bookCode);
			System.out.println("Book Name: " + b.bookName);
			
			ois.close();
		}
		catch(Exception ee) {
			System.out.println(ee);
		}
	}

}
