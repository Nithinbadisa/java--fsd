package com.database;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletConfig;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;


	@WebServlet("/UpdateBooking")
	public class UpdateBooking extends HttpServlet {
		
		Connection connection; 
		String driver="com.mysql.cj.jdbc.Driver";
		String dburl="jdbc:mysql://localhost:3306/mydb";
		String dbuser="root";
		String dbpass="nithin";
		@Override
		public void init(ServletConfig config) throws ServletException {

			try {
				System.out.println("AddServlet init");
				ServletContext context = config.getServletContext();
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(dburl,dbuser, dbpass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			String fligntno = (String) session.getAttribute("cfno");
			
			
			response.setContentType("text/html");
			String cfno = request.getParameter("cfno");
			String username = request.getParameter("username");
			String userid = request.getParameter("userid");
			String npeople = request.getParameter("npeople");
			String tdate = request.getParameter("tdate");
			
			try (PreparedStatement statement = connection.prepareStatement("insert into bookings(username,user_id_proof,no_of_people,date_of_travel,fno) values (?,?,?,?,?)")) {

				statement.setString(1, username);
				statement.setString(2, userid);
				statement.setString(3, npeople);
				statement.setString(4, tdate);
				statement.setString(5, cfno);
				
				int rowsupdated = statement.executeUpdate();
				System.out.println("Number of rows updated to bookings table"+rowsupdated);
				
				PreparedStatement statement1 = connection.prepareStatement("select * from flights inner join bookings on flights.fno = bookings.fno and flights.fno = ?");
				statement1.setString(1, cfno);
				
				ResultSet rows = statement1.executeQuery();
				String Flightnumber = null;
				String airlinename = null;
				String bloc = null;
				String dloc = null;
				String p = null;
				String uname = null;
				String uid = null;
				String npp = null;
				String dtrav = null;
				
				while (rows.next()) {
				Flightnumber = rows.getString(1);
				airlinename = rows.getString(2);
				bloc = rows.getString(3);
				dloc = rows.getString(4);
				p = rows.getString(5);
				uname = rows.getString(7);
				uid = rows.getString(8);
				npp = rows.getString(9);
				dtrav = rows.getString(10);
				}
				
				int price = Integer.parseInt(p);
				int no_people = Integer.parseInt(npp);
				int total_payable_amount = no_people*price;
				

				
				
				PrintWriter out = response.getWriter();
				out.print("<h2>Booking Confirmation Details</h2>");
				out.print("<p>Ariline Name: "+airlinename+"</p>");
				out.println("<p>Passenger Name: "+uname+"</p>");
				out.println("<p>Passenger ID details: "+uid+"</p>");
				out.println("<p>Number of people traveling: "+no_people+"</p>");
				out.println("<p>Date of travel: " +dtrav +"</p>");
				out.println("<p>Boarding Location:"+ bloc+"</p>");
				out.println("<p>Destination Location: "+dloc+"</p>");
				out.println("<p>Total amount:"+total_payable_amount+"</p>");
				//out.write("<p><a href=\"pay.html\">Procced to Payment</a></p>");
				//.write("<form action='success.jsp'>");
				out.write("<p>Enter Card Number:<input name='cardnumber' type='text'></input></p>");
				out.write("<p>Enter CVV:<input name='cvv' type='text'></input></p>");
				out.write("<a href='/FlyAway/bookSuccess' >book</a>");
				//out.println("<p><input type='submit'></input></p>");
				out.write("</form>");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			

		}
		@Override
		public void destroy() {
			try {
				System.out.println("DeleteServlet.destroy() method. DB connection closed");
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	
}
