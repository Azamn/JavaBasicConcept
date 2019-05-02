package Java_Threads;

//  this is Normal class

/*class MyTask{
	void ExecuteMyTask() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("$$ Printing Document  #"+doc+" - Printer1");
		}
	}
}*/

// This is thread Class
// MyTask Is-A Thread
/*class MyTask extends Thread{
	@Override
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("$$ Printing Documnet  #"+doc+" - Printer1");
		}
	}
}*/

class CA{
	
	
}
//class MyTask extends CA,Thread{  -> Error | Multiple inheritance is not supported in java
class MyTask extends CA implements Runnable{
	@Override
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("$$ Printing Documnet  #"+doc+" - Printer1");
		}
	}
}

class YourTask extends Thread{
	public void run() {
		for(int i =0; i<=10;i++) {
			System.out.println("the Value of i = "+i);
		}
	}
}

public class ThreadApp {

	// main method represents main thread
	public static void main(String[] args) {
		// whatever we write in the here will be executed by main method
		// thread always execute the jobs in a sequence
		
		//job1 
		System.out.println("*****Application Started*******");
		
		//job2
		//MyTask task = new MyTask(); // child thread	
		//task.ExecuteMyTask();
		//task.start(); // start shall internally execute the run method
		
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.setDaemon(true);
		task.start();
		
		Thread yourTask = new Thread(new YourTask());
		yourTask.start();
		
		// Till job 2 is not finished, below written jobs are in waiting and it is not executing
		// i.e is main thread is in sequence
		// in case Job2 is a long running process, i.e several documents are supposed to be printed
		// In such a use case OS/JVM shall given a message that app is not responding
		// Some sluggish behaviour in app can be observed -> App seems to be hang
		
		// now, main and MyTask are executing parrallely or concurrently.
		
		//job3
		for(int doc=1;doc<=10;doc++) {
			System.out.println("@@ Printing Documnet #"+doc+" - printer2");
		}
		
		//job4
		System.out.println("*****Application Finished*******");

	}

}
