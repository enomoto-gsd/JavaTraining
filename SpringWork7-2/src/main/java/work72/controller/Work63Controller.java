package work72.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import work72.entity.UserEntity;
import work72.form.UserForm;
import work72.service.UserService;

@Controller
public class Work63Controller {

	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/registar")
	public String registar(@Validated @ModelAttribute UserForm userForm,BindingResult bindingResult,Model model ) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","入力規則に誤りがあり登録できません。");
			return "registar-ng";
		}else {
			UserEntity entity = service.serviceRegistar(userForm);
			model.addAttribute("user",entity);
			return "registar-ok";
		}
		
	}
	
}
