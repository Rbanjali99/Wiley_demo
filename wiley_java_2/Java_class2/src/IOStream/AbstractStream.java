package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AbstractStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		int i = 0;
		while ((i= fis.read())!= -1) {
			System.out.println((char)i);
		}
		fis.close();
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		String str = "now bny programmer"; //overwriting
		
		byte[] b = str.getBytes();
		fout.write(b);
		
		fout.flush();
		fout.close();

	}

}
