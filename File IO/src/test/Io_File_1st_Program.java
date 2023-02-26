package test;

import java.io.File;
import java.io.IOException;

public class Io_File_1st_Program {
	
	public static void main(String[] args) {
		
		File file= new File("N:\\Core Java\\Test File IO\\FIle_IO_Text.text");
		
		boolean b=file.exists();
		System.out.println(b);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		
	}

}
