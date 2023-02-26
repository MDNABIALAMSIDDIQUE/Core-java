package com.arrayList;

public class EmailVerify {
  public boolean check(String s) {
	  boolean b=false;
	  int c=0;
	  if(s.endsWith("gmail.com")&&s.length()>15) {
		  
		  for(int i=s.length()-9; i>0;i--) {
			  if(s.charAt(i)=='@'||s.charAt(i)=='.'||s.charAt(i)==' ') {
				  
				  c++;
			  }
			 
		  }
		  if(c==1) {
			  b=true;
		  }
	  }
	  
	  
	  
	  return b;
  }
  
	
	
	public static void main(String[] args) {
		EmailVerify emailVerify=new EmailVerify();
		
		System.out.println(emailVerify.check("asasasasasa@gmail.com"));
	}

}
