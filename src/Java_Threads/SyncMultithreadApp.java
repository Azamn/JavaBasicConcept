package Java_Threads;

class printer{
	//synchronized void printDocumnet(int numOfCopies, String docName) { // Synchronized is used then first execute the first thread then other 
	void printDocumnet(int numOfCopies, String docName) { 
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+ "="+i);
		}
	}
}
// now using thread

class MyThread extends Thread{
	printer pRef; // here take reference of printer class
	
	public MyThread(printer p) { // constructor
		pRef = p;
	}
	
	public void run() {
		synchronized (pRef) { // Synchronized is used for lock that method, this block not execute whole the code till not execute other threa
			pRef.printDocumnet(5, "JOhn Profile");
		}	
	}
}

class YourThread extends Thread{
	printer pref;
	
	YourThread(printer p){
		pref = p;
	}
	
	public void run() {
		synchronized (pref) {
			pref.printDocumnet(10, "FiaonsDocumnet");
		}	
	}
}

public class SyncMultithreadApp {

	public static void main(String[] args) {
	
		System.out.println("***** Application Started *****");
		
		printer p = new printer();
		//p.printDocumnet(10, "Azam.pdf");
		
		// Scenario is that we have multiple thread working on the Printer Object
		// If mUltiple threads are going to work on the same single object we must synchronize them
		MyThread thread = new MyThread(p); // MYthread is having reference to the printer object
		YourThread thread1 = new YourThread(p); // YourThread is having reference to the printer object
		
		thread.start();
		/*
		 * try { thread.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		thread1.start();
		
		System.out.println("******** Apllication Finished ******");

	}

}
