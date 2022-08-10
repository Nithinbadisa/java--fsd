package HibernateAdd;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import HibernateAdd.HibernateUtils;
import HibernateAdd.Products;


	
	@WebServlet("/save")
	public class SaveServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub

			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			
			String name=req.getParameter("pname");
			BigDecimal price=new BigDecimal(req.getParameter("pprice"));
			
			
			SessionFactory factory= HibernateUtils.getSessionFactory();
			Session session= factory.openSession();
			
			
			Transaction tx= session.beginTransaction();
			
			Products s1=new Products(name, price);
			session.save(s1);
			
			tx.commit();
			
			session.close();
			out.print("Data inserted Successfully");
			
			 
			
			
			
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}
		
		

}
