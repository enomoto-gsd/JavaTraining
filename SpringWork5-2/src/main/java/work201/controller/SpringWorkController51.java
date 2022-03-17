package work201.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import work201.entity.UserEntity;
import work201.form.UserForm;
import work201.service.UserService;
@Controller
public class SpringWorkController51 {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("login")
	public String login(@Validated @ModelAttribute UserForm userform,
			BindingResult bindingResult,Model model) {
			
		if(bindingResult.hasErrors()) {
			return "registar-ng";
		}

		//Formで受け取った情報からEnityクラスに変換する処理。
		UserEntity userentity = userService.serviceLogin(userform);
		if("kazuki".equals(userentity.getName())&& 26==userentity.getAge()) {
			model.addAttribute("user",userentity);
			return "registar-ok";
		}else{
			model.addAttribute("message","ログインに失敗しました。");
			return "registar-ng";
		}
	}
	
}
