package ThreadingConcurrencyUtils;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	BlockingQueue<Integer> questionQueue;

	public Consumer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}



	@Override
	public void run() {
		while(true) {
			try {
			// in ArrayBlocking two method are take() and put()
				Thread.sleep(1000);
				System.out.println("Answered Question : " + questionQueue.take());
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
