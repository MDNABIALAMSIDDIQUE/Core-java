package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_Date_File {
	
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream= new FileInputStream("N:\\Core Java\\Test File IO\\FIle_IO_Text.text");
			System.out.println(fileInputStream);
			try {
				int i = fileInputStream.read();
				System.out.println(i);
				System.out.println((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
