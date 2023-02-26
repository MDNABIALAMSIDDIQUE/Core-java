package test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seri_and_Descrial {
	
	public static void main(String[] args) {
		
		WriteFile_Object writeFile_Object= new WriteFile_Object();
		
		writeFile_Object.setANo(112233);
		writeFile_Object.setUserName("Nabi1122");
		writeFile_Object.setPassword("*****+++++");
		writeFile_Object.setBalance(12032);
		
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("N:\\Core Java\\Test File IO\\Bank.text"));
			objectOutputStream.writeObject(writeFile_Object);
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("N:\\Core Java\\Test File IO\\Bank.text"));
			
			
			WriteFile_Object readFile_Object=(WriteFile_Object)objectInputStream.readObject();
			System.out.println("A/c Number = "+readFile_Object.getANo());
			System.out.println("User Name = "+readFile_Object.getUserName());
			System.out.println("Password  = "+readFile_Object.getPassword());
			System.out.println("Total Amount = "+readFile_Object.getBalance());
			System.out.println("CLass Obj = "+readFile_Object.getClass());
			
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
