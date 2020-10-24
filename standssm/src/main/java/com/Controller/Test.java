package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("/cnm")
	public String test(Model model) {
			model.addAttribute("msg", "傻逼插件");
			return "index.html";
	
	
	}
}
