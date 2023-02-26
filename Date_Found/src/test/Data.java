package test;

import java.util.Scanner;

public class Data {

	final int m[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	int dd,mm,yyyy;
	public Data(int dd,int mm, int yyyy) {
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
		
	}
	int getNumberofLeepYear() {
		if (mm>2) 
			return yyyy/4-yyyy/100+yyyy/400;
		 else 
			return(yyyy-1)/4-(yyyy-1)/100+(yyyy-1)/400;
		}
		
		
		
		
		int  getNumberofDays() {
			int dCount=yyyy*365+getNumberofLeepYear()+dd;
			for (int i = 0; i < mm-1 ; i++) {
				dCount+=m[i];
			}
			return dCount;
		}
		int difference(Data d1,Data d2) {
			int dy1=d1.getNumberofDays();
			int dy2=d2.getNumberofDays();
			
			if(dy1>dy2)
				return dy1-dy2;
			else
				return dy2-dy1;
			
	}
		public String toString() {
			return dd+":"+mm+":"+yyyy+" ";
		}
		static Data readData() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter the Date-------...dd...");
			int dd=scanner.nextInt();
			System.out.println("Enter the MM..........");
			int mm=scanner.nextInt();
			System.out.println("Enter the Year.... yyyy");
			int yy=scanner.nextInt();
			return new Data(dd, mm, yy);
		}
		public static void main(String[] args) {
			Data data1=readData();
			Data data2=readData();
			System.out.println("Number of Date Between"+data1+"And"+data2+"is"+data1.difference(data1, data2));
			}
}
