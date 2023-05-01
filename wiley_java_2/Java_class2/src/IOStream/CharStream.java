package IOStream;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStream {

	public static void main(String[] args) throws IOException {
		
		Writer out = new OutputStreamWriter(System.out);
		
		Writer fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
	
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I like programming , what to do");
		
		bw.flush();
		bw.close();
		fw.close();
		
		Reader in = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Data3");
		int i = 0;
		while ((i = in.read())!=-1) {
			System.out.println((char)i);
		}
		
	}

}
