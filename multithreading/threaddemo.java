package multithreading;

public class threaddemo extends Thread {
	
	public void run() {
		
		System.out.println("thread strated");
	}
	
	public static void main(String[] args) {
	
	threaddemo t1= new threaddemo();
	threaddemo t2 = new threaddemo();
	
	t1.start();
	t2.start();
	
	}
	
}
