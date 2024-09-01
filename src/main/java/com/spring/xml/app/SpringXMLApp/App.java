package com.spring.xml.app.SpringXMLApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springAppContext.xml");
    	Course course = (Course) context.getBean("course");
    	course.selectCourse();
    }
}
