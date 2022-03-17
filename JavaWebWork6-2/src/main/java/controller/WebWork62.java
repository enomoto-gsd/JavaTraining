package controller;
import model1.HumanManager;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model1.Human;
import java.util.ArrayList;
/**
 * Servlet implementation class WebWork62
 */
@WebServlet("/WebWork62")
public class WebWork62 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HumanManager humanmanager = new HumanManager();
		ArrayList<Human> humanList =humanmanager.getHumanList();
		request.setAttribute("human", humanList);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

}
