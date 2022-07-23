package serialization;

import java.io.Serializable;

public class student implements serializable {
	
		
		int id;
		String  name;
		String email;
		String password;
		
		public student(int id, String name, String email, String password) {
			
			this.id = id;
			this.name = name;
			this .email=email;
			this.password = password;
		}
		
			public student(double d, String string, String string2) {
			// TODO Auto-generated constructor stub
		}

			public void display () {
			
			        System.out.println(id+ " " +name+" "+email+" "+password);
			
	}
			
			public static void main(String[] args) {
				
				student s1=new student(1,"nithin", "nithinkum1rgmail.com", "nit123"); 
			    s1.display();
				
			}

}
