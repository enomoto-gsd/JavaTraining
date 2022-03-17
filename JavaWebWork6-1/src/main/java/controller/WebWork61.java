package controller;

import model.Human;
import model.HumanManager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebWork61
 */
@WebServlet("/WebWork61")
public class WebWork61 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		
		//HumanManagerクラスを介して、インスタンスを作成して受け取る。
		Human human = HumanManager.getHuman(name, age);
		
		//属性をセットする。
		request.setAttribute("human", human);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
		
	}

}
