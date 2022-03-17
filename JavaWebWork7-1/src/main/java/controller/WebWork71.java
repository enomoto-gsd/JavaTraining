package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HumanManagement;
import model.Human;
/**
 * Servlet implementation class WebWork71
 */
@WebServlet("/WebWork71")
public class WebWork71 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HumanManagement humanmana = new HumanManagement();
		ArrayList<Human> humanList =humanmana.select();
		request.setAttribute("human", humanList);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		HumanManagement humanmana = new HumanManagement();
		humanmana.insert(name,age);
		
		RequestDispatcher rd = request.getRequestDispatcher("response2.jsp");
		rd.forward(request, response);
	}

}
