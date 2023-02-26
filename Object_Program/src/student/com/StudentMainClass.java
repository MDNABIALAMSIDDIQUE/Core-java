package student.com;

public class StudentMainClass {
public static void main(String[] args) {
	
	Student student= new Student();
	student.input(112233, "Zohan","IIT Hyd");
	
	student.input(101, "Zuraje", "IIT PATNA");
	System.out.println(student);
	
	student.DisplayInfo();
	student.DisplayInfo();
}
}
