package com.learn.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView mvcRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("welcome");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		mv.addObject("uname", uname);
		mv.addObject("password", password);
		return mv;
	}
}
