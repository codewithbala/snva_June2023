

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("tname");
		String fname = request.getParameter("tfname");
		
		//Create an inmemory cookie
		Cookie ck1 = new Cookie("name", name);
		Cookie ck2 = new Cookie("fname", fname);
		
		//add cookies to the response object
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		//Generate another form dynamically
		pw.println("<html>");
		pw.println("<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Cookie 2</title>\r\n"
				+ "<style>\r\n"
				+ "        table {\r\n"
				+ "            border-collapse: collapse;\r\n"
				+ "            width: 100%;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        th, td {\r\n"
				+ "            padding: 8px;\r\n"
				+ "            text-align: left;\r\n"
				+ "            border-bottom: 1px solid #ddd;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        th {\r\n"
				+ "            background-color: #f2f2f2;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        tr:hover {\r\n"
				+ "            background-color: #f5f5f5;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>");
		pw.println("<body>");
		pw.println("<h1 style=\"color: blue; font-size: 24px; text-align: center;\">Income Details</h1>");
		pw.println("<form method= 'get' action = 'SecondServlet'> ");
		pw.println("<table><tr>");
		pw.println("<td> This Year's Income:</td><td> <input type = 'number' name='tincome'></td></tr> ");
		pw.println("<tr><td> This Year's Tax: </td>	<td> <input type = 'number' name='tax' ></td></tr>");
		pw.println("<tr><td><input type ='submit' value = 'Continue'></td><td></td></tr>");
		pw.println("</table></form>");
		pw.println("</body></html>");
		pw.close();
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
