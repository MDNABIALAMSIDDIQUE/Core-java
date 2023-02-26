package display.com;

public class MainDisplay {
	
	public static void main(String[] args) {
		Display display=new Display();
		

		MyTread myTread= new MyTread(display, "NABI");
		MyTread myTread1= new MyTread(display, "ALAM");
		myTread.start();
		myTread1.start();
	}

}
