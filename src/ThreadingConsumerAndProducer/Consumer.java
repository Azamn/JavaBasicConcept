package ThreadingConsumerAndProducer;

import java.util.List;

public class Consumer implements Runnable{

	List<Integer> questionList = null;
		
	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
		
	}


	public void answerQuestion() throws InterruptedException {
		synchronized (questionList) {
			while(questionList.isEmpty()) {
				System.out.println("No question to Answer... Waiting for producer to get question..!");
					questionList.wait();
				
			}	
		}
		
		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered question :" + questionList.remove(0));
			questionList.notify();
		}
		
	}


	@Override
	public void run() {
		
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
