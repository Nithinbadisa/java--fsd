package retrive;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/find")
public class FindServlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub


		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("id");
		//converting string to int
		int  id=  Integer.parseInt(param);
		
		Properties props= new Properties();
		
		InputStream  in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	
		Connection  conn=DBconfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				
				Statement stmt =conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from eproduct where id = "+id+"");
				out.print("<hl> display the product</h1>");
				out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
				out.print("<th>ID</th><th>NAME</th><th>PRICE</th>");
				out.print("<tr></thead>");
				out.print("<tbody>");
				
				while(rs.next())
				{
					out.print("<tr><td>");
					out.println(rs.getInt(1));
					out.print("</td>");
					out.print("<td>");
					out.print(rs.getString(2));
					out.print("</td>");
					out.print("<td>");
					out.print(rs.getString(3));
					out.print("</td>");
					out.print("<td>");
					
					
				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			out.println("Error while Connecting");
		}
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}


}
