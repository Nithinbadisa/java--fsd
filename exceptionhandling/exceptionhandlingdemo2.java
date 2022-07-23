package exceptionhandling;

public class exceptionhandlingdemo2 {
	
static void waitFor() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		waitFor();
	}

}
