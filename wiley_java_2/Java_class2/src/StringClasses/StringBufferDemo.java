package StringClasses;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer chatHistory = new StringBuffer();
		
		String sender = "Venkat";
		String message = "Hey Anjali!";
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		System.out.println(chatHistory);
		chatHistory.append("\n");
		
		sender = "Scahin";
		message = "hiiii";
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		System.out.println(chatHistory);
//		System.out.println(chatHistory.getClass());
		
		
	}

}
