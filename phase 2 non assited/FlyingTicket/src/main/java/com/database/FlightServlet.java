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


	@WebServlet("/FlightServlet")
	public class FlightServlet extends HttpServlet {
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
		
			try (PreparedStatement statement = connection.prepareStatement("select * from flights" )) {

				ResultSet rows = statement.executeQuery();
				PrintWriter out = response.getWriter();
				out.print("<h2>All Flight details</h2>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<th>Flight_Number &nbsp; &nbsp;</th>");
				out.println("<th>Airline_Name&nbsp; &nbsp;</th>");
				out.println("<th>Boarding_Location&nbsp; &nbsp;</th>");
				out.println("<th>Destination_Location&nbsp; &nbsp;</th>");
				out.println("<th>Price</th>");
				out.println("</tr>");
				while (rows.next()) {
					out.println("<tr>");
					out.println("<td>" + rows.getString(1) + "</td>");
					out.println("<td>" + rows.getString(2) + "</td>");
					out.println("<td>" + rows.getString(3) + "</td>");
					out.println("<td>" + rows.getString(4) + "</td>");
					out.println("<td>" + rows.getString(5) + "</td>");
					out.println("</tr>");
					out.println("<br>");
				}
				out.println("</table>");
				PrintWriter pw = response.getWriter();

				
				pw.write("<p><a href=\"admin.html\">Admin Home</a></p>");
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

