package IOStream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws IOException {
/*		FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		String str = "Wiley fullstack project";
		
		byte[] b = str.getBytes();
		fout.write(b);
		
		fout.flush();
		fout.close();
	*/	
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		int i = 0;
		while ((i= fis.read())!= -1) {
			System.out.println((char)i);
		}
		fis.close();

	}

}
