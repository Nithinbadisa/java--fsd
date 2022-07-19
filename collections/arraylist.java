package collections;
import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		System.out.println("size of the class:L "+ list.size());
		System.out.println(list);
		
		list.add(null);
		list.add("nithin");
		list.add("kumar");
		list.add("badisa");
		list.add("working");
		
		
		System.out.println("size of the class: "+list.size());
		System.out.println(list);
		
		System.out.println("does the class contains working?:"+list.contains("working"));
		System.out.println(list);
		
		System.out.println("get the person name: "+list.get(1));
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
	}

}
