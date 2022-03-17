

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebWork54
 */
@WebServlet("/WebWork54")
public class WebWork54 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//åªç›éûçèÇÃéÊìæ
		Date date = new Date();
		request.setAttribute("date", date);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
		
	}

}
