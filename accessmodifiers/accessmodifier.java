package accessmodifiers;

public class accessmodifier {

	public void methodpublic() {
		System.out.println("this is public method");
	
	}
	
	private void methodPrivate() {
		System.out.println("this is private method");
	}
	
	void methodDefault() {
		System.out.println("this is default method");
	}
	
	protected void methodProtected() {
		System.out.println("this is protected method");
		
	}
	
	public static void main(String[] args) {
		accessmodifier obj = new accessmodifier();
		
	    obj.methodpublic();
	    obj.methodPrivate();
	    obj.methodDefault();
	    obj.methodProtected();
		
	}
}
