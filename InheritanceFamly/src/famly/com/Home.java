package famly.com;

public class Home {
	
	String HomeName;
	Integer HouseNo;
	String adress;
	String type;
	
	
	public Home() {
		System.out.println(" Class  Home");
	}
	
	public Home(String HomeName,Integer HouseNo,String adress,String type) {
		
		System.out.println("this is Home Date");
		this.HomeName=HomeName;
		this.HouseNo=HouseNo;
		this.adress=adress;
		this.type=type;
	}

}
