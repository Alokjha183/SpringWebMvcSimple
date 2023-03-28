package com.alok.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alok.Entity.UserEntity;
import com.alok.Repository.UserRepo;
import com.alok.bindings.User;

@Controller
public class UserController {
	@Autowired
	private UserRepo repo;
	@GetMapping("/")
	public String loadForm() {
		return "index";
	}
	@PostMapping("/user")
	public String handleSubmitBtn(User user, Model model) {
		System.out.println(user);
		UserEntity entity=new UserEntity();
		BeanUtils.copyProperties(user, entity);
		repo.save(entity);
		model.addAttribute("msg","user saved");
		return "index";
	}

}
