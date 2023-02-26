package com.inner;

public class Program03 {
	
			public void m1()
			{
					class Inner
					{
						public void sum(int i,int j)
							{
								System.out.println("The Sum :"+(i+j));
							}
					}
					Inner i =  new Inner();
						i.sum(20, 60);
						i.sum(100, 200);
						i.sum(300, 700);
				
			}
			public static void main(String[] args) {
				new Program03().m1();
			}

}
