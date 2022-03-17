

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class WebWork55
 */
@WebServlet("/WebWork55")
public class WebWork55 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ope1= request.getParameter("ope1");
		String ope2= request.getParameter("ope2");
		
		//åvéZÇ≈Ç´ÇÈÇÊÇ§Ç…intå^Ç÷ïœä∑ÇçsÇ§ÅB
		int parseOpe1 = Integer.parseInt(ope1);
		int parseOpe2= Integer.parseInt(ope2);
		
		int sum = parseOpe1 + parseOpe2;
		
		request.setAttribute("sum", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
		
	}

}
