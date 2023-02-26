package inner.com;

public class Program_02 {
	class Inner{
		public void m1() {
			System.out.println("MD NABI ALAM");
			
		}
		public void m2() {
			Inner inner = new Inner();
			{
				inner.m1();
				
			}
			
		}
	}
		
		public static void main(String[] args) {
			Program_02 program_02= new Program_02();
			System.out.println(program_02);
			
		}
	}

	


