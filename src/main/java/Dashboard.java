

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>E-Commerce Web-site</h1>");
		HttpSession session=request.getSession(false);
		String userID=null;
		String Password=null;
		if(session.getAttribute("pass")!=null);
		Password=(String)session.getAttribute("pass");
		if(session.getAttribute("userid")!=null);
		userID=(String)session.getAttribute("userid");
		if(userID.contains("userid") && Password.contains("pass"))
			{
			out.println("UserId obtained from session: "+userID+"<br>");
			out.println("<a href='logout'>Logout of session</a><br>");
		}
		else {
			out.println("Oops!! Invalid User ID Please try again!<br>");
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
