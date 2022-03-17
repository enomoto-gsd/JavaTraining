
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WebWork72
 */
@WebServlet("/WebWork72")
public class WebWork72 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// input�œ��͂��ꂽ�����擾
		String name = request.getParameter("name");

		// �X�R�[�v�ɏ����Z�b�g
		// �A�v���P�[�V�����X�R�[�v
		ServletContext context = getServletContext();
		context.setAttribute("name", name);
		// ���N�G�X�g�X�R�[�v
		request.setAttribute("name", name);
		// �Z�b�V�����X�R�[�v
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		RequestDispatcher rd =request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}

}
