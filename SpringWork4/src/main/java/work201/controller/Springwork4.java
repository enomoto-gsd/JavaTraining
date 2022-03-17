package work201.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import work201.Form.Form;
import work201.entity.UserList;
import work201.service.UserListService;

@Controller
public class Springwork4 {
	
	@Autowired
	UserListService userListService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		List<UserList> users = userListService.findAll();
		model.addAttribute("users",users);
		return "output";
	}
	
	@PostMapping("add")
	public String add(@ModelAttribute Form userform) {
		userListService.save(userform.getName(),userform.getAge());
		//読み込みなおせという指示
		return "redirect:/";
	}
	
	@GetMapping("delete")
	public String deleteUser(@RequestParam Integer id) {
		userListService.delete(id);
		return "redirect:/";
	}
		
}
