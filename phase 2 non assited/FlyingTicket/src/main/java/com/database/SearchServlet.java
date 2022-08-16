package com.database;


	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletConfig;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class SearchServlet
	 */
	@WebServlet("/SearchServlet")
	public class SearchServlet extends HttpServlet {
		
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
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(dburl, dbuser, dbpass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			String bloc = request.getParameter("bloc");
			String dloc = request.getParameter("dloc");

			
			try (PreparedStatement statement = connection.prepareStatement("select * from flights where boardinglocation = ? and destinationlocation = ?")) {

				statement.setString(1, bloc);
				statement.setString(2, dloc);
				ResultSet rows = statement.executeQuery();
				PrintWriter out = response.getWriter();
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

				
				pw.write("<p><a href=\"confirmflights.jsp\">Book Flight</a></p>");
				pw.write("<p><a href=\"index.html\">Home</a></p>");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void destroy() {
			System.out.println("DeleteServlet.destroy() method. DB connection closed");
			PrintWriter connection = null;
			connection.close();
		}

	}

