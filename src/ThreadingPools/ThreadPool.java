package ThreadingPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executer = Executors.newFixedThreadPool(2); // recycle threads
		
		Runnable processor = new MessageProcessor(2);
		executer.execute(processor);
		
		Runnable processor1 = new MessageProcessor(3);
		executer.execute(processor1);
		
		Runnable processor2 = new MessageProcessor(4);
		executer.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executer.execute(processor3);
		
		executer.shutdown(); // Rejects any new task from being submitted Gracefully shut down the service.
		// executer.shutdownNow(); // Terminate the executer service immediatley
		
		// another way to terminate the task
		
		try {
			executer.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		while(!executer.isTerminated()) {
//			
//		}
		
		System.out.println("Submitted all tasks..!");

	}

}
