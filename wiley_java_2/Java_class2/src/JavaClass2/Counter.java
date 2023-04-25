package JavaClass2;

public class Counter {
	
	private static int count = 0;
	private final String name;
	
	public Counter(String name) {
		this.name = name;
	}
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter("anjali");
		System.out.println(c.getCount());
		c.increment();
		System.out.println(c.getCount());
		
	}

}
