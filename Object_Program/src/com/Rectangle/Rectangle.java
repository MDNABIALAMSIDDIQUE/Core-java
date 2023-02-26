package com.Rectangle;

public class Rectangle {
	
	int length,width;
	
	void input(int i,int w) {
		length=i;
		width=w;
		
	}
	void DisplayArea() {
		int area;
		area=length*width;
		System.out.println("Area = "+area);
	}

}
