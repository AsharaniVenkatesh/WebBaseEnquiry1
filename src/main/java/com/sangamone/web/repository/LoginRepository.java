package com.sangamone.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import com.sangamone.web.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
	
	@Query(value="select * from loginadmin where lusername=?1 and lpassword=?2", nativeQuery=true )
	List<Login> findByUsernameAndPassword(String lusername, String lpassword);
	
}