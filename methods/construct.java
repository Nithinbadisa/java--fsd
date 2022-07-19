package methods;

public class construct {
	
	int empid;
	String empname;
    String empdept;
	int sal;
	
	public construct() {
		
		empid= 001;
		empname = "unknown";
		empdept = "finance";
		sal = 30000;
	}
	
	public construct(int empid, String empname, String empdept, int sal) {
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.sal = sal;
		
	}		
		
    public void display() {
			System.out.println("Id: "+empid);
			System.out.println("Name: "+empname);
			System.out.println("Department: "+empdept);
			System.out.println("Salary: "+sal);
			System.out.println();
				
	}
	
	public static void main(String[] args) {
		construct obj=new construct();
		construct e=new construct();
		construct e1=new construct(02, "nithin", "finance", 40000);
		construct e2=new construct(03, "kumar", "software", 45000);
		
		e.display();
		e1.display();
		e2.display();
		
	}

}
