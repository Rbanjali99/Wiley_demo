package StringClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuilder sb  = new StringBuilder("Wiley");
	//	sb.append(" Edge");
	//	System.out.println(sb);
		
		StringBuilder logmessage  = new StringBuilder();
		
		long timestamp = System.currentTimeMillis();
		
		logmessage
		.append("[").
		append(timestamp).
		append("]");
		
		int userId = 123456;
		logmessage
		.append("UserId- ")
		.append(userId)
		.append(": ");
		
		logmessage.append("Logged in successfully");
		System.out.println(logmessage);
	}

}
