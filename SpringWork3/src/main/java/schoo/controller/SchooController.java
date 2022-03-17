package schoo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import schoo.form.LoginForm;

/**
 * ログイン機能クラス.
 */
@Controller
public class SchooController {

	@Autowired
	HttpSession session;

	/**
	 * トップページの表示<br>
	 * ログイン済みの場合はログアウト画面を表示
	 * @return
	 */
	@GetMapping("/")
	public String index(Model model) {
		// ログイン状態のチェック
		String login = (String)session.getAttribute("login");
		if ("ログイン中".equals(login)) {
			model.addAttribute("userName","榎本");
			return "logout";
		} else {
			return "index";
		}
	}
	/**
	 * ログイン処理
	 * @param loginForm	ログインForm
	 * @param bindingResult	入力チェック結果
	 * @return	処理結果ページのパス
	 */
	@PostMapping("login")
	public String login(@Validated @ModelAttribute LoginForm loginForm,
						BindingResult bindingResult,Model model) {
		
		// 入力チェック
		if (bindingResult.hasErrors()) {
			model.addAttribute("message","ログインできませんでした。");
			return "index";
		}

		// IDとパスワードのチェック
		if ("enomoto".equals(loginForm.getLoginId()) &&
			"kazuki".equals(loginForm.getLoginPassword())) {
			session.setAttribute("login", "ログイン中");
			model.addAttribute("userName","榎本");
			return "login-ok";
		} else {
			model.addAttribute("message","ログインできませんでした。");
			return "index";
		}
			
	}
	/**
	 * ログアウト処理
	 * @return
	 */
	@GetMapping("logout")
	public String logout() {
		
		session.invalidate();
		return "index";
	}
}