package validation;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	@WebServlet("/login")
	public class LoginServlet extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			 
			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			
			String email= req.getParameter("email");
			String password = req.getParameter("pass");
			
			if(email.equals("nithinkum1r@gmail.com") && password.equals("Nithin@123")) {
			
			//add  user in the session once the login is done
			HttpSession session=req.getSession();
			session.setAttribute("email", email);
			session.setAttribute("pass", password);
			
			resp.sendRedirect("dashboard");
			}
			else {
				resp.sendRedirect("index.html");
			}
			
			
			
			
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}
		


	}




