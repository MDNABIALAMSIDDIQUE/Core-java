package Program03;

public class MyThreadDEmo {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread  = new MyThread();
		myThread.start();
		myThread.join();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Class");
		}
		
		
	}

}
