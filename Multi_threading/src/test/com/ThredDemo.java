package test.com;

public class ThredDemo extends Mythread {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Class Thread");
			
		}
	}

}
