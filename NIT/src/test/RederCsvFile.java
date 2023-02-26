package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RederCsvFile {

	public static void main(String[] args) throws FileNotFoundException {
	        File file=new File("D:\\MOCK_DATA.CSV");
	        System.out.println(file);
	        Scanner sc1=new Scanner(file);
	      // sc1.useDelimiter(",");
	        String string ="";
	       
	        int i=0;
	       while (i<3) {
	    	   
	    	   if(i==0){
	    	  sc1.next();
	    	   }
	    	   else {
	    		   string+=sc1.next()+"\n";
			}
			i++;
		}
	       String[] string2=string.split(",");
	       System.out.println(Arrays.toString(string2));
	       

	}

}
