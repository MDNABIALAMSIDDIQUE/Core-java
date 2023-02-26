package display.com;

public class Display {
	
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name);
			
		}
	}

}
