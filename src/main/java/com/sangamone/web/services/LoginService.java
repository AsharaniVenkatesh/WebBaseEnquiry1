package com.sangamone.web.services;

import java.util.List;

import com.sangamone.web.model.Common;

public interface LoginService {
	
	List<Common> getCompanyDetails(String lusername, String lpassword);

}
