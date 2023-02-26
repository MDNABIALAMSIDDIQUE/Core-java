package text;

public class ThreadDemo {
	
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		
		thread.run();
		
		for (int i = 0; i < 10; i++) {
			
			
			System.out.println("Main Thread");
			
			
		}
		
		
	}

}
