package project;



	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	
	@WebServlet("/Product")
	public class product extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public product() {
			super();
			// TODO Auto-generated constructor stub
		}

		protected void processRequest(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html;charset=UTF-8");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Product Details Portal</title>");
			out.println("</head>");
			out.println("<body>");
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String color = request.getParameter("color");
				float price = Float.parseFloat(request.getParameter("price"));

				ProductClass product1 = new ProductClass(id, name, color, price);
//				product1 = new ProductClass(id, name, color, price));

				HttpSession session = request.getSession();
				session.setAttribute("data", product1);
				request.setAttribute("data", product1.getProductDetails());
				RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
				rd.forward(request, response);

				out.println("</body>");
				out.println("</html>");

			} catch (NumberFormatException e) {
				out.println(e);
			} catch (Exception e) {
				out.println(e);
			}
		}

		private Object getproduct() {
			// TODO Auto-generated method stub
			return null;
		}

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			processRequest(request, response);

		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			processRequest(request, response);
		}

	}


