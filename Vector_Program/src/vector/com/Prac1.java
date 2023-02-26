package vector.com;

public class Prac1 {
          static  public void m1(int a) {
            	if(a==0) {
            		return;
            	}
            	System.out.println(" a of value of ="+ (a+1));
            	m1(a-1);
            	System.out.println(a+1);
            }
	public static void main(String[] args) {
		m1(6);
        
	}

}
