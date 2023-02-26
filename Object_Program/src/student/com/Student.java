package student.com;

public class Student {
	
	int rollNumber;
	String name,college;
	
	void input(int r,String n,String c)
		{
			rollNumber=r;
			name=n;
			college=c;
		}
	void DisplayInfo() {
		System.out.println(rollNumber +"  "+name +" "+college);
		System.out.println("************************************");
	}
}
