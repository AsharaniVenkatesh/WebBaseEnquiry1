package com.sangamone.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sangamone.web.model.Common;
import com.sangamone.web.model.Login;
import com.sangamone.web.repository.CommonRepo;
import com.sangamone.web.repository.LoginRepository;
import com.sangamone.web.services.impl.LoginServiceImpl;

@Controller
public class LoginController {

	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	CommonRepo commonRepo;
	
	@Autowired
	LoginServiceImpl loginServiceImpl;

	@RequestMapping("/")
	public String checkMVC() {
		return "login.jsp";
	}


	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("lusername") String lusername, @RequestParam("lpassword") String lpassword,
			Model model) {
		Login login = null;
		System.out.println("lusername: " +lusername);
		System.out.println("lpassword: " +lpassword);

		try {
		 List<Login> login1= loginRepository.findByUsernameAndPassword(lusername, lpassword);
		
		 if (!login1.isEmpty()) {
				/*
				 * model.addAttribute("lusername", lusername); model.addAttribute("lpassword",
				 * lpassword);
				 */
			 
			    model.addAttribute("bhashavidya",loginServiceImpl.getCompanyDetails(lusername, lpassword));
				return "display.jsp";

			}else {
				System.out.println("else error");
			model.addAttribute("error", "User Not Found !!!");
			return "login.jsp";
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("User not found");
			
			return "error.jsp";
		}
		
	}	  
	 
}