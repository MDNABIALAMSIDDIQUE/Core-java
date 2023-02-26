package com.dbg.com;

public class FullDateEmplyee  extends EmployeeDate{
	
	int id;
	int sal;
	int pf;
	
	 FullDateEmplyee(int id,int sal,int pf,String name,int Mob,String companyName,String addres,Integer  pin) {
		super(name, Mob, companyName,addres,pin);
		
		this.id=id;
		this.sal=sal;
		this.pf=pf;
		 
	}
		void emp() {
			System.out.println("Name "+name);
			System.out.println("Mob "+Mob);
			System.out.println("Company Name "+companyName);
			System.out.println("Address "+addres);
			System.out.println("Pin Code "+pin);
			System.out.println("Employee  ID "+id);
			System.out.println("Emp Sal "+sal);
			System.out.println("Emp Pf "+pf);
		}
		
		public static void main(String[] args) {
			
			FullDateEmplyee fullDateEmplyee= new FullDateEmplyee(1220, 4525, 5625, "MD NABI", 504403, "TCS", "Bhopal",4525);
			fullDateEmplyee.emp();
		}
	

}
