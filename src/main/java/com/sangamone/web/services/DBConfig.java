package com.sangamone.web.services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
 @Value("${spring.datasource.url}")
    private String url;

@Value("${spring.datasource.username}")
   private String userName;

@Value("${spring.datasource.password}")
   private String password;

@Bean
public  Connection connection() {
Connection con1=null;

try {

con1=DriverManager.getConnection(url,userName, password);
System.out.println("con1: "+con1);
} catch (SQLException e) {
e.printStackTrace();
}

return con1;

}

}