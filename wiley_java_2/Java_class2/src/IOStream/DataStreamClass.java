package IOStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {


/*		FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		DataOutputStream dos = new DataOutputStream(fout);
		
		String inp = "I am a Programer";
		dos.writeBytes("hiiiiiii ");
		dos.writeBytes(inp);
		dos.flush();
		dos.close();
		*/
		FileInputStream fin = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		
		DataInputStream dis = new DataInputStream(fin);
		
		int count = fin.available();
		byte[] ba = new byte[count];
		
		dis.read(ba);
		
		for(byte b :ba) {
			System.out.println((char)b);
		}
		
		dis.close();
		fin.close();
		
		
	}

}
