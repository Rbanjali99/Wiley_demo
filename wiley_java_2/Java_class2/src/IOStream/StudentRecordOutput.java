package IOStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import IOStream.Student;

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void Write(Student student) throws IOException {
		dataOutput.writeBytes("name : " + student.getName());
//		dataOutput.writeBytes("gender : " + Student.isGender());
		dataOutput.writeBytes("age : " + String.valueOf(student.getAge()));
		dataOutput.writeBytes("Grade : " + String.valueOf(student.getGrade()));
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	public static void main(String[] args) {
		
		
		String outputFile = "C:\\Users\\HP\\OneDrive\\Desktop\\IOstreamfiles_wiley\\students";
		List<Student> listStudent = new ArrayList<>();
		
		listStudent.add(new Student("Anjali",true,22,90.9f));
		listStudent.add(new Student("Neha",true,21,88.91f));
		listStudent.add(new Student("Alok",false,23,70.5f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputFile);
			
			for(Student student:listStudent) {
				outputWriter.Write(student);
			}
			outputWriter.save();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
