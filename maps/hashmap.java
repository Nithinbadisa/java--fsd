package maps;
import java.util.HashMap;

public class hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "nithin");
		map.put(2, "kumar");
		map.put(3, "badisa");
		map.put(null, null);
		map.put(null,"nit");
		
		System.out.println(" output of the class is: "+map);
		
	    System.out.println("get the value of 3:"+map.get(3));
	    System.out.println("get the value of Null: "+map.get(null));
	    
	    map.remove(2);
	    System.out.println("output: "+map);
		
	}

}
