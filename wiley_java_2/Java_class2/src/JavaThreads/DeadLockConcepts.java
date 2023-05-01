package JavaThreads;

public class DeadLockConcepts {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		LockThread lt1 = new LockThread();
		lt1.start();
	}
	
	public static class LockThread extends Thread{
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1 hold : Lock1");
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			System.out.println("Thread1 is waiting for lock2");
			
			synchronized(Lock2) {
				System.out.println("Thread 1 hold : Lock2");
				
			}
		}
	}

}
