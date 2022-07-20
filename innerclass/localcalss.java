package innerclass;

public class localcalss {
	
	void validate(String lockertype) {
		
		if(lockertype.equals("nithinkumar")) {
			
			class inner {
				
				void check() {
					System.out.println("your password is correct");
				}
				
			}
				
				inner.Inner=new inner();
				Inner.check();
			
		}	
				
				else {
					System.out.println("not correct password");
					
				}
				
			
	}		
		
	
	public static void main(String[] args) {
		
		localcalss y = new.localcalss();
		y.validate()
		
	}
}
	


