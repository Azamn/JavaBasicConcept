package Threading;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sequence sequence = new Sequence();
//		for(int i = 0; i<100; i++ ) {
//			System.out.println(sequence.getNext());
//		}
		
		worker worker1 = new worker(sequence);
		worker1.start();
		
		worker worker2 = new worker(sequence);
		worker2.start();
	}

}

class worker extends Thread{
	Sequence sequence = null;
	
	public worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println(Thread.currentThread().getName() + " got value : "+ sequence.getNext());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

