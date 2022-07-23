package synchronization;

public class synchronizationdemo {
	
public static void main(String[] args) {
		
		sender Sender = new  sender();
		
		user t1 = new user("nithin","hi gud morning...", Sender);
		user t2 = new user("nikun", "yes gud morning", Sender);
		
		t1.start();
		t2.start();

}
}
