package com.spring.xml.app.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.xml.app.SpringXMLApp.Course;

@Configuration
public class AppConfig {
	
	
	@Bean(name = "course")
	public Course getCourse() {
		return new Course();
	}

}
