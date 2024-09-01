package com.spring.xml.app.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.xml.app.SpringXMLApp.Course;

public class AnnotationAppContext {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ctxt.getBean("course", Course.class).selectCourse();
		
		
		
	}
	
	
	
	

}
