package com.dowilse;

import java.util.HashMap;
import java.util.Map;

public class With {
	
	public Map<String,Integer> countnumber(String s){
		 Map<String,Integer> mpMap=new  HashMap<String,Integer>();
		 for(int i=0;i<s.length();i++) {
			 int count=0;
			 for(int j=0;j<s.length();j++) {
				 if(s.charAt(i)==s.charAt(j)) {
					 count++;
				 }
				 
			 }
			 
			 if(s.charAt(i)==' ') {
				 mpMap.put("Space", count);
			 }
			 else 
			 {
				 mpMap.put(s.charAt(i)+"", count);
			 }
			 
		 }
		 
		 return mpMap;
		
	} 

	public static void main(String[] args) {
		
	      System.out.println(new With().countnumber("aaabbbccc  aa "));
	      Map mp=new With().countnumber("aaabbbccc  aa ");
	      System.out.println(mp.keySet());
	      System.out.println(mp.get("a"));
	      System.out.println(mp.isEmpty());
	      
	}

}
