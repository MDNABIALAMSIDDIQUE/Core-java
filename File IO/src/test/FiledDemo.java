package test;

import java.io.File;

public class FiledDemo {
	public static void main(String[] args) {
		
		File file = new File("N:\\Core Java\\Test File IO\\Nit");
		System.out.println(file.exists());
		boolean b=file.mkdir();
		System.out.println(b);
	}

}
