package display.com;

public class MyTread  extends Thread{
	Display d;
	String name;
	 MyTread(Display d,String name) {
		 this.d=d;
		 this.name=name;
	}
	 public void run() {
		 d.wish(name);
	 }

}
