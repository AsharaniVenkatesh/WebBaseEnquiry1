package com.sangamone.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.ModelAndView;

import com.sangamone.web.model.Common;
import com.sangamone.web.model.Login;

public interface CommonRepo extends CrudRepository<Common, Integer> {

	
	@Query(value="select * from enquiry where ecompany=?", nativeQuery=true)
	List<Login> getCompany(String ecompany);
	
	@Query(value="select * from enquiry where ecompany=?", nativeQuery=true)
	List findAllByCompanyName(String ecompany);

	
	/*
	 * @Query(value="select * from enquiry where ecompany=?", nativeQuery=true)
	 * List<Common> find(String string);
	 */

}
