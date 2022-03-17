package work201.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import work201.form.UserForm;

@Controller
public class SpringWorkController51 {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("login")
	/*＠ModelAttributeによって、画面で入力された内容を受け取る。
	*モデルにインスタンスを登録している。
	*/
	public String login(@Validated @ModelAttribute UserForm userform,
						BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "registar-ng";
		}
		
		if("kazuki".equals(userform.getName())&& 26==userform.getAge()) {
			return "registar-ok";
		}else{
			return "registar-ng";
		}
		
	}
}
