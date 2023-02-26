package qus_Problem;

import java.io.FileWriter;
import java.io.IOException;

public class FileWirte_Program {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fileWriter = new FileWriter("N:\\Core Java\\Test File IO\\nit.text");
			fileWriter.write("MD NABI ALAM");
			fileWriter.write("\n");
			fileWriter.write(11);;
			fileWriter.write("\n");
			char[] ch= {'D','B','G'};
			fileWriter.write(ch);
			System.out.println("Succesfully Loaded the File..");
			fileWriter.flush();
			fileWriter.close();
			//fileWriter.write("MM");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
