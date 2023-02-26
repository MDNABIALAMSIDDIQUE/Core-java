package test;

public class Var_Arg {
	
	public static void methodone(int []... x) {
		for(int[]a:x) {
			System.out.println(a[0]);
		}
		
	}
	
	public static void main(String[] args) {
		int [] l= {10,20,30};
		int[] ll = {40,50};
		methodone(l,ll);
	}

}
