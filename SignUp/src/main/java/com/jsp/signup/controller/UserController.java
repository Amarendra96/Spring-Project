package com.jsp.signup.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.signup.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/signUpUser")
	public ModelAndView saveUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display.jsp");
		boolean validation = (boolean)req.getAttribute("validation");
		if (validation) {
			int userId = Integer.parseInt(req.getParameter("userId"));
			String userName = req.getParameter("userName");
			String userPassword = req.getParameter("userPassword");
			String userEmail = req.getParameter("userEmail");
			userService.saveUser(userId, userName, userPassword, userEmail);
			modelAndView.addObject("message", "<h1>User Signed in Successfully</h1>");
		} else {
			modelAndView.addObject("message", req.getAttribute("message"));
		}
		return modelAndView;
	}
}
