package com.jiao.test;

import com.jiao.entity.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 老焦
 */
public class ApplicationContextDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Message message = context.getBean("message", Message.class);
		message.printMessage();
	}
}
