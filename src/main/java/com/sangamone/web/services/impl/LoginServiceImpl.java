package com.sangamone.web.services.impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sangamone.web.model.Common;
import com.sangamone.web.services.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	Connection connection;
	
	@Override
	public List<Common> getCompanyDetails(String lusername, String lpassword) {
		
		List<Common> emp=null;
		String cname=null;
		try {
			Connection con=jdbc.getDataSource().getConnection();
			String sql1="select * from loginadmin where lusername =?" ;
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setString(1, lusername);
			ResultSet rs1=ps1.executeQuery();
			
			if(rs1.next()) {
				
				cname=rs1.getString("cname");
			}
			
			String sql2="select * from enquiry where ecompany=?";
			PreparedStatement ps2=con.prepareStatement(sql2);
			ps2.setString(1, cname);
			ResultSet rs2=ps2.executeQuery();
			 
			emp=new ArrayList<>();
		
			while(rs2.next()) {
				Common common=new Common();

				common.setEid(rs2.getInt("eid"));
				common.setEname(rs2.getString("ename"));
				common.setEmail(rs2.getString("email"));
				common.setEcontactno(rs2.getString("econtactno"));
				common.setEgrade(rs2.getString("egrade"));
				common.setEmessage(rs2.getString("emessage"));
				common.setEcompany(rs2.getString("ecompany"));
				emp.add(common);
			}
			connection.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}

		return emp;
	}

}
