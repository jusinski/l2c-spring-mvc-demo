package com.jusinski.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldContorller {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-show-form";
	}

	@RequestMapping("/processUpperForm")
	public String processUpperForm(HttpServletRequest request, Model model) {

		String theName = request.getParameter("kendokaName");

		theName = theName.toUpperCase();

		String result = "Onegaishimasu " + theName + "!!!";

		model.addAttribute("message", result);

		return "helloworld-show-form";
	}
	
	@RequestMapping("/processUpperFormRequestParam")
	public String processUpperFormRequestParam(@RequestParam("kendokaName") String theName, Model model) {

		theName = theName.toUpperCase();

		String result = "Hai " + theName + "!!!";

		model.addAttribute("messageFormRequestParam", result);

		return "helloworld-show-form";
	}

}
