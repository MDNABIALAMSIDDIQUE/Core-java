package reverse.string.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString_01 {
	public static void main(String[] args) {
		String string="";
		System.out.println("Enter the Any String ....");
		try {
			BufferedReader bufferedReader= new BufferedReader
					(new InputStreamReader(System.in));
			string=bufferedReader.readLine();
			char[] rev=string.toCharArray();
			for (int i = rev.length-1; i >= 0; i--) {
				System.out.print(rev[i]);
			}
		} 
		catch (Exception e) {
			System.out.println("I am Catch Bloack...");
			e.printStackTrace();
		}
		
		
	}

}
