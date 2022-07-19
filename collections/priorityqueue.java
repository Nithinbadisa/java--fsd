package collections;
import java.util.PriorityQueue;

public class priorityqueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> x= new PriorityQueue();
		x.add(12);
	    x.add(44);
	    x.add(55);
	    x.add(67);
	    
	    System.out.println("sizeof the class"+x.size());
	    System.out.println(x);
	    
	    System.out.println("first element of the class:"+x.peek());
	    System.out.println(x);
	    
	    System.out.println("print the first value and remove: "+x.poll());
	    System.out.println(x);
	    
	    x.remove(44);
	    System.out.println("print the top valhe; "+x.peek());
	    System.out.println(x);
	    
	    
	}    
	    

}
