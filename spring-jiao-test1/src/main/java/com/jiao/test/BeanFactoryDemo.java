package com.jiao.test;

import com.jiao.entity.Message;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 老焦
 */
public class BeanFactoryDemo {
	public static void main(String[] args) {
		//配置文件封装类：ClassPathResource
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Message message = factory.getBean("message", Message.class);   //Message是自己写的测试类
		message.printMessage();
	}
}
