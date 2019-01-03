package mythread;

public class MyThread implements Runnable {
	private int counter = 0;
	
	public void run() {
		while(true) {
		counter++;
		System.out.println("Counter : "+counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
