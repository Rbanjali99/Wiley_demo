package JavaThreads;

class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		
	}
	
}

public class ThreadGroupConcepts {

	public static void main(String[] args) {
		
		ThreadGroup tgParent = new ThreadGroup("Parent Group");
		ThreadGroup tgChild1 = new ThreadGroup(tgParent,"child group");
		
		Thread t1 = new Thread(tgParent ,new Demo(),"first");
		Thread t2 = new Thread(tgParent ,new Demo(),"Second");
		Thread t3 = new Thread(tgParent ,new Demo(),"Third");
		
		Thread t4 = new Thread(tgChild1 ,new Demo(),"FisrtChild1");
		t4.start();
		t1.start();
		t2.start();
		t3.start();
		
//		t1.suspend();
//		t2.resume();
		System.out.println("Active Group : " + tgParent.activeCount() );
		System.out.println("Active Group : " + tgChild1.activeCount() );
		tgParent.list();
		
	}

}
