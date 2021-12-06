package com.sangamone.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangamone.web.model.Common;
import com.sangamone.web.repository.CommonRepo;

@Controller
public class CommonAllController {

	@Autowired
	CommonRepo commonRepo;

	@RequestMapping("/bhashavidya")

	public String getLoginPage1() {
		return "bhashavidya2.jsp";
	}

	@RequestMapping("/saveInfoBhashaVidya")
	public String saveInfoBhashaVidya(Common common) {
		boolean flag = false;
		try {
			if (common != null) {
				commonRepo.save(common);
				flag = true;

			} else {
				System.out.println("Failed to insert[");
			}
			if (flag == true) {
				Email.newStudent(common.getEcompany(), common.getEname(), common.getEmail(), common.getEcontactno(),
						common.getEgrade(), common.getEmessage());

			} else {
				System.out.println("Failed");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return "bhashavidya2.jsp";

	}

	// #######SangamOne######

	@RequestMapping("/sangamone")

	public String getLoginPage2() {
		return "sangamone2.jsp";
	}

	@RequestMapping("/saveInfoSangamOne")
	public String saveInfoSangamOne(Common common) {
		boolean flag = false;
		try {
			if (common != null) {
				commonRepo.save(common);
				flag = true;

			} else {
				System.out.println("Failed to insert[");
			}
			if (flag == true) {
				Email.newStudent(common.getEcompany(), common.getEname(), common.getEmail(), common.getEcontactno(),
						common.getEgrade(), common.getEmessage());

			} else {
				System.out.println("Failed");
			}

		} catch (Exception e) {
			System.out.println(e);

		}

		return "sangamone2.jsp";

	}

	@RequestMapping("/display")
	public String getdisplay(Model model) {
		System.out.println("Enter into Model");
		model.addAttribute("bhashavidya", commonRepo.findAll());
		System.out.println("Enter into return");
		return "display.jsp";

	}

	
	  @RequestMapping("/getCompanyName")
	  
	  public String getCompanyName(Model model,@RequestParam String company) {
	  model.addAttribute("bhashavidya",commonRepo.getCompany(company));
	  return "display.jsp";
	  
	  }
	 

}
