package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Wedding extends Thread{
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}

public class WeddingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ExecutorService executor = Executors.newFixedThreadPool(4);
//		ExecutorService executor = Executors.newCachedThreadPool();
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
//		executor.scheduleAtFixedRate(new Wedding(), 5, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new Wedding(), 5, 2, TimeUnit.SECONDS);
		
		//		for(int i = 0 ; i<= 100 ; i++) {
//			executor.execute(new Wedding());
//		}

	}

}
