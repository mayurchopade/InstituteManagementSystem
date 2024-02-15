package com.thekiranacademy.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@ComponentScan("com")
//@EnableAspectJAutoProxy
public class InstituteManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteManagementSystemApplication.class, args);
		System.out.println("hello");
	}

}
