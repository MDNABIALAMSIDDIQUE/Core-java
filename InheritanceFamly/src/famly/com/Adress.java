package famly.com;

public class Adress extends Home{
	
	String PSName;
	String POName;
	
	Adress() {
	System.out.println(" Class  Adress");
	}
	
	 public Adress(String PSName,Integer HouseNo,String HomeName,String POName,String adress,String type) {
		 super(HomeName, HouseNo, adress, type);
		 this.PSName=PSName;
		 this.POName=POName;
	 }

	 void famy() {
		 System.out.println("Home Name "+HomeName);
		 System.out.println("House No "+HouseNo);
		 System.out.println("Adress "+adress);
		 System.out.println("House Type "+type);
		 System.out.println("PS Name  "+PSName);
		 System.out.println("PO Name  "+POName);
		
	 }
	 
	 public static void main(String[] args) {
		
		 Adress adress= new Adress("BelaGanj", 2152,"MANNAT","Gaya", "Bhindaspur","Owen");
		 adress.famy();
		
	}
	
}
