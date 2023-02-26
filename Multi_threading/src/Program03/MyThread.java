package Program03;


public class MyThread extends Thread {

	
			public void run() {
				
				for (int i = 0; i <5; i++) {
					System.out.println("No Main Class");
					try {
						Thread.sleep(-10);
					} 
					catch (Exception e) {
						e.getClass();
						e.printStackTrace();
					}
					
				}
				
			}
		
}
