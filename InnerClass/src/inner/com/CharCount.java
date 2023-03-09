package inner.com;

public class CharCount {
public static void main(String[] args) {
	
	String string="aabb 2$$%%$#vjj111!!!!!!!!!!!!!!!j";
	for (int i = 0; i < 256; i++) {
		   int count = 0;
		for (int j = 0; j < string.length(); j++) {
			
			if (string.charAt(j)==(char)i) {
				
				count ++;
			}
		}
		 if (count>0) {
			System.out.println("Count : "+count+(char)i);
		}
	}
}
}
