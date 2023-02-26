package test;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("N:\\Core Java\\Test File IO\\FIle_IO_Text.text");
			fileOutputStream.write('N');
			fileOutputStream.write('A');
			fileOutputStream.write('B');
			fileOutputStream.write('I');
			System.out.println(fileOutputStream);
			fileOutputStream.write(1);
			System.out.println("Plese Chek Your File");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
