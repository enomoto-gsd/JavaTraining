

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebWork53
 */
@WebServlet("/WebWork53")
public class WebWork53 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		//リクエストスコープに値を格納する。
		request.setAttribute("name", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

}
