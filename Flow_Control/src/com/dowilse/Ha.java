package com.dowilse;

import java.util.HashMap;
import java.util.Map;

public class Ha {
	

	public static void main(String[] args) {
		
        String name="he l lo thr ";
       Map<String, Integer> mp=new HashMap<>();
       
       for(int i=0; i<name.length();i++) {
    	   int count=0;
    	   for(int j=0;j<name.length();j++) {
    		 
    		   if(name.charAt(i)==name.charAt(j)) {
    			   count++;
    		   }
    		   if(name.charAt(i)==' ') {
    			   mp.put("Space", count);
    			   
    		   }
    		   else {
    			   mp.put(name.charAt(i)+"", count);
			}
    		   
    	   }
    	  
    	   
    	
       }
      System.out.println(mp);
	}

}
