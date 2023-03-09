package core.com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThowsExp {

	public static void main(String[] args) {
		try {
			System.out.println("=================================");
			@SuppressWarnings({ "unused", "resource" })
			PrintWriter printWriter= new PrintWriter("g//java.txt");
			System.out.println("------------------------------------");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
