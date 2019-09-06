package com.CollegeManagement.Springbootmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@ComponentScan("com.CollegeManagement.Repository")
//@EnableJpaRepositories(basePackages = "com.CollegeManagement.Repository")
@SpringBootApplication
public class SpringBootMysqlApplication {

	public static void main(String[] args) {
		System.out.println("before main");
		SpringApplication.run(SpringBootMysqlApplication.class, args);
		System.out.println("in main");
	}

}
