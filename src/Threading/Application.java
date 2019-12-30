package Threading;

public class Application {

	public static void main(String[] args) {
		
		// This is using Thread Class
		
		System.out.println("Staring thread 1 ");
		Task task = new Task("Thread-A");
		task.start();
			
		System.out.println("Starting thread 2 ");
		Task task1 = new Task("Thread-B");
		task1.start();
		
		// this is usign Runnable interface
		
		System.out.println("Starting first Thread..!");
		// you can call this type also
		Thread t1 = new Thread(new Tasks("Thread-C"));
		t1.start();
		
		System.out.println("Starting Second Thread..!");
		Tasks task3 = new Tasks("Thread-D");
		Thread t2 = new Thread(task3);
		t2.start();
		
	}

}

class Task extends Thread{
	String name;
	public Task(String name) {
		super();
		this.name = name;
	}
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i = 0; i<=100; i++) {
			System.out.println("Number : "+ i +" - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Tasks implements Runnable{
	
	String name;

	public Tasks(String name) {
		super();
		this.name = name;
	}
	 public void run() {
		 Thread.currentThread().setName(name);
		 
		 for(int i=0; i<=50; i++) {
			 System.out.println("Number :"+ i +"-" + Thread.currentThread().getName());
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	
}



