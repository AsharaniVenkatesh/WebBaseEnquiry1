package com.sangamone.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.web.model.Common;
import com.sangamone.web.repository.CommonRepo;

@Service
public class CommonServices {
	
	@Autowired
	private CommonRepo commonRepo;
	

	  public Common bhashavidya(String ecompany) {
		  Common commonInfo = (Common) commonRepo.getCompany(ecompany);
		  return commonInfo;
	  }

}
