

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*中級3回章末問題
 * 以下のWebアプリケーションを作ってみる。
 * 1.SampleWork14というアプリケーション名
 * 2.DesplayServletというリソース名
 * 3.リクエストパラメータに名前と年齢を渡すことができる。
 * 4.リクエストパラメータは以下のメソッドを使って画面(レスポンス)に表示
 * response.getWriter().append(名前や年齢を表示)
 */

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UTF-8を設定
		request.setCharacterEncoding("UTF-8");
		//名前と年齢のパラメーターの取得
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		
		//名前と年齢をレスポンスに表示する。
		response.getWriter().append("名前は"+ name+ "年齢は" + age);
	}

}
