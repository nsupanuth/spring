package spring.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.model.User;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String get(Model model){
		return "index";
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public String post(HttpServletRequest req,Model model){
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		
		//model
		User u = new User();
		u.setFirstname(name);
		u.setLastname(lastname);
		model.addAttribute("user", u);
		return "index";
	}
	
	
	
	
}
