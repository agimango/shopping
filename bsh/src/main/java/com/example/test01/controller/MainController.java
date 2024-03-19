package com.example.test01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import com.example.test01.vo.UserVO;

@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/index"})	
	public String index() {
		return "/hello";
	}
	@GetMapping("/hello")
	public String hello() {
		return "user/hello";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
}

