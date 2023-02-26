package test.com;

public class Mythread extends Thread {
	
	public void run() {
		Thread.yield();
		System.out.println("Child Class");
	}

}
