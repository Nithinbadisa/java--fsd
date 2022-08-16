package com.database;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	@WebServlet("/bookSuccess")
	public class BookSuccess extends HttpServlet {
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
	       
	   
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			
			try {
				PreparedStatement statement1 = connection.prepareStatement("select * from bookings,flights where flights.fno=bookings.fno and uid = (select max(uid) as uid from bookings)");
				ResultSet rows = statement1.executeQuery();
				
				PrintWriter out = response.getWriter();
				out.print("<h1>Booking Successful Details</h1>");
				while (rows.next()) {
					out.print("<p>Booking ID: "+rows.getString(1)+"</p>");
					out.print("<p>Airline Name: "+rows.getString(8)+"</p>");
					out.print("<p>Flight Number: "+rows.getString(6)+"</p>");
					out.print("<p>Date of Travel: "+rows.getString(5)+"</p>");
					out.print("<p>Passenger Name: "+rows.getString(2)+"</p>");
					out.print("<p>Number of Passengers: "+rows.getString(4)+"</p>");
					out.print("<p>Boarding Location: "+rows.getString(9)+"</p>");
					out.print("<p>Destination Location: "+rows.getString(10)+"</p>");
					
					}
				out.print("<h3>THANK YOU</h3>");
				out.print("<p><a href='index.html'>Home</a></p>");
			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
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
