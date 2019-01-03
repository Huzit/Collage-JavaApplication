package mythread;

public class MythreadDriver {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		Thread thread = new Thread(mythread);
		
		thread.start();
	}

}
