package IOStream;
import java.util.*;
import java.io.*;

public class STudentRecordReader {
	DataInputStream dataInput;
	
	public STudentRecordReader(String inputFile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputFile));
		
	}
	
	public List<Student> readAll() throws IOException{
		List<Student> listStudent = new ArrayList<>();
		try {
		while(true) {
			String name = dataInput.readUTF();
			boolean gender = dataInput.readBoolean();
			int age = dataInput.readInt();
			float grade = dataInput.readFloat();
			
			Student student = new Student(name,gender,age,grade);
			
			listStudent.add(student);
			}
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		dataInput.close();
		return listStudent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (args.length < 1) {
//			System.out.println("Please provide the path");
//			System.exit(0);
		
//		}
		String inputFile = "C:\\Users\\HP\\OneDrive\\Desktop\\IOstreamfiles_wiley\\Data3";
		try {
			STudentRecordReader reader = new STudentRecordReader(inputFile);
			List<Student> listOfStudent = reader.readAll();
			
			for(Student student : listOfStudent) {
				System.out.print(student.getName() + "\t");
				System.out.print(student.isGender() + "\t");
				System.out.print(student.getAge() + "\t");
				System.out.println(student.getGrade());
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	

	}

}
