package test;

public class BitWise {
	public static void main(String argr[])
	{
		int a = 50;
		int b= 25;
		int c = 0;
		
		c= a&b;
		System.out.println(c);
		
		c=  a|b;
		System.out.println(c);
		c= a^b;
		System.out.println(c);
		c= ~a;
		System.out.println(c);
		
		c = a<<2;
		System.out.println(c);
		c=a>>2;
		System.out.println(c);
	}
}
