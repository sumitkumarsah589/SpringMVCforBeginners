package com.learn.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView mvcRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("welcome");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		mv.addObject("uname", uname);
		mv.addObject("password", password);
		mv.addObject("age", age);
		mv.addObject("gender", gender);
		return mv;
	}
}
