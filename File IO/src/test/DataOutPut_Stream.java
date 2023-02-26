package test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPut_Stream {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("N:\\Core Java\\Test File IO\\All_Type.text");
			DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
			System.out.println("**********************************");
			System.out.println(fileOutputStream);
			System.out.println("**********************************");
			System.out.println(dataOutputStream);
			System.out.println("**********************************");
			
			dataOutputStream.write('N');
			dataOutputStream.writeUTF("NABI ALAM");
			//dataOutputStream.write(55);
		//	dataOutputStream.writeFloat(22.2f);
			dataOutputStream.writeBoolean(true);
			//dataOutputStream.writeLong(1111222233);
			System.out.println("Plz Your Chek File...."+dataOutputStream);
			System.out.println(dataOutputStream.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
