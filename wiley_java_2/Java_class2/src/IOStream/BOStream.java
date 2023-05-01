package IOStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BOStream {

	public static void main(String[] args) throws IOException {
		
/*		FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\data1");
		BufferedOutputStream bof = new BufferedOutputStream(fout);
		
		String str = "I am a Programmer";
		
		byte[] b = str.getBytes();
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(b);
		*/
		FileInputStream fin = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\data1");
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		int i;
		try {
		while((i = bis.read())!=-1) {
			System.out.println((char)i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		bis.close();
		fin.close();
		
		

	}

}
