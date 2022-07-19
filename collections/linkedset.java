package collections;

import java.util.LinkedHashSet;

public class linkedset {
public static void main(String[] args) {
		
		LinkedHashSet<String> list= new LinkedHashSet<String>();
		// in thi set dulplicate values ae nor printed
		System.out.println("size of the class:L "+ list.size());
		System.out.println(list);
		
		list.add(null);
		list.add("nithin");
		list.add("kumar");
		list.add("badisa");
		list.add("working");
		list.add("nithin");
		
		System.out.println("size of the class: "+list.size());
		System.out.println(list);
		
		System.out.println("does the class contains working?:"+list.contains("working"));
		System.out.println(list);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
	}

}



