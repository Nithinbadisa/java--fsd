package synchronization;

public class user extends Thread {
	String name;
	String msg;
	String sender;
	
	public user(String string, String string2, synchronization.sender sender2) {
		// TODO Auto-generated constructor stub
	}

	public void User(String name,String msg, String sender) {
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		System.out.println(name + "wants to send message : "+msg);
		
		//without synchronization
	    //sender.send(msg
	    
	    //with synchronization
	    synchronized(sender) {
	    	sender.send(msg);
	    }
	}

}
