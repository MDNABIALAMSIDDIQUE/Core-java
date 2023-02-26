package stremapi;

import java.util.ArrayList;

public class StrimAPIArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("Patna");
		arrayList.add("Gaya");
		arrayList.add("Bhindaspur");
		arrayList.add("Darbhnga");
		
		System.out.println(arrayList);
		
		System.out.println("Strem API");
		arrayList.forEach((ar)->{
			System.out.println(ar);
		});
		
	}

}
