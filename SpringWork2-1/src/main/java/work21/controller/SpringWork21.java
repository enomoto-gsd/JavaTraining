package work21.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import work21.form.UserForm;

@Controller
public class SpringWork21 {
	
	@Autowired
	 HttpSession session;
	
	@GetMapping("/")
		public String index() {
			String login =(String)session.getAttribute("login");
			if("ok".equals(login)) {
				return "logout";
			}else{
				return "index";
			}
	}
	
	@GetMapping("logout")
		public String logout() {
			session.invalidate();
			return "index";
		}
	
	@PostMapping("login")
		public String login(@Validated @ModelAttribute("user") UserForm userform,BindingResult bindingResust) {
			
		if( bindingResust.hasErrors()) {
				return "inputng";
		}
		
		if("kazuki".equals(userform.getId()) && "pass".equals(userform.getPassword())){
			//ログイン成功ページに遷移する。
			return "inputok";
		}else{
			//ログイン失敗ページに遷移する。
			return "inputng";
		}
		
	}
	
	
}
