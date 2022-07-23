package multithreading;

public class threademo2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("thread started");
	    // TODO Auto-generated method stub
  } 
	
	public static void main (String[] args) {
		
		threademo2 t1= new threademo2();
		threademo2 t2 =new threademo2();
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		
		t3.setName("nithin");
		t4.setName("kumar");
		
		t3.getName();
		t4.getName();
		
		t3.start();
		t4.start();
	}

	
}
