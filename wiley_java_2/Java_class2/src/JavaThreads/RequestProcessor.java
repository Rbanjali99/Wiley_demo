package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {

	private ExecutorService threadPool;
	private ThreadGroup databaseThreadGroup;
	private ThreadGroup reportThreadGroup;
	
	public RequestProcessor() {
		threadPool = Executors.newFixedThreadPool(10,new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
				return new Thread(r);
			}
			
		});
		
		databaseThreadGroup = new ThreadGroup("Database thread");
		reportThreadGroup = new ThreadGroup("Report thread");
		
		
	}	
	public void processRequest(Request request) {
		
	}
	
	public static void main(String[] args) {
		Runnable Task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(request.getType() == RequestType.DATABASE_QUERY) {
					Thread.currentThread().setThreadGroup();
				}
			}};
		
	}

}
enum RequestTypr{
	DATABASE_QUERY,
	REPORT_GENERATION
}
class Request{
	private RequestType type;
	private String data;
	public Request(RequestType type,String data ) {
		
	}
}
