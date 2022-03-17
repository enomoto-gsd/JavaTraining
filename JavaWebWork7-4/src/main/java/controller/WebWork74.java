package controller;
import model.UserManager;
import model.User;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Servlet implementation class WebWork74
 */
@WebServlet("/WebWork74")
public class WebWork74 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String testId= request.getParameter("testId");
		String password = request.getParameter("password");
		//sessionオブジェクトの取得
		HttpSession session = request.getSession();
		//UserManaerクラスをインスタンス化
		ArrayList<User> userList = new ArrayList<>();
		UserManager um = new UserManager();
		userList =um.getUser(testId,password);
		
		
		session.setAttribute("userList", userList);
		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

}
