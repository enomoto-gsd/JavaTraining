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
		//ログ出力
		System.out.println("----Controllerクラス　indexメソッド開始-----");
		System.out.println("----Controllerクラス　indexメソッド終了-----");
		return "index";
	}
	
	
	@PostMapping("login")
	public String login(@Validated @ModelAttribute UserForm userform,
			BindingResult bindingResult,Model model) {
		//ログ出力
		System.out.println("----Controllerクラス　loginメソッド開始-----");
		if(bindingResult.hasErrors()) {
			model.addAttribute("message","チェック項目を満たしてません。");
			System.out.println("----Controllerクラス　loginメソッド終了-----");
			return "registar-ng";
		
		}

		//Formで受け取った情報からEnityクラスに変換する処理。
		UserEntity userentity = userService.serviceLogin(userform);
		if("kazuki".equals(userentity.getName())&& 26==userentity.getAge()) {
			model.addAttribute("user",userentity);
			//ログ出力
			System.out.println("----Controllerクラス　loginメソッド終了-----");
			return "registar-ok";
		}else{
			model.addAttribute("message","名前と年齢の組み合わせがあっていません。");
			System.out.println("----Controllerクラス　loginメソッド終了-----");
			return "registar-ng";
		}
	}
	
}
