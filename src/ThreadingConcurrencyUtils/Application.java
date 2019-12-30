package ThreadingConcurrencyUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		
		// using ArrayBlockingQueue we dont define to wait() and notify() method automatically works after capacity of ArrayBlocking here capacity is 5.
		
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		
		Thread t1 = new Thread(new Producer(questionQueue));
		Thread t2 = new Thread(new Consumer(questionQueue));
		
		t1.start();
		t2.start();
	}

}
