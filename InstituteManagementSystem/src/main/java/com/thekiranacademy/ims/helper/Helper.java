package com.thekiranacademy.ims.helper;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Helper {

	@Before( "execution (* com.thekiranacademy.ims.controller.Teaching_Faculty_Controller.getAllFaculty())")
	public void TeacherAuthorization() {
		System.out.println("authorization started" + LocalDateTime.now());
	}
	
}
