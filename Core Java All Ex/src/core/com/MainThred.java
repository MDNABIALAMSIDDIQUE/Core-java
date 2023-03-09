package core.com;

class ChildThred extends Thread{
	
	public static void rub() {
		System.out.println("i am Child Thred...");
	}
}



public class MainThred {
	 public static void main(String[] args) {
		
		 ChildThred childThred = new ChildThred();
		 childThred.start();
		 ChildThred.rub();
		 
		 System.out.println("main");
		 

	}
	

}
