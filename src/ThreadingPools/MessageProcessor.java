package ThreadingPools;

public class MessageProcessor implements Runnable{

	private int message;

	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+ "[RECEIVED] Message = " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName()+ "[Done] Processing Message = " + message);
	}

	private void respondToMessage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message : "+ message);
		}
	}
	
	
	
	
}
