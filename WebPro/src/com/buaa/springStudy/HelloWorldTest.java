package com.buaa.springStudy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloWorldTest 
{
    public static void main( String[] args )
    {
    	BeanFactory beanFactory = 
        		new ClassPathXmlApplicationContext("conf/config.xml");
        HelloWorld helloWorld = beanFactory.getBean("HelloWorld", HelloWorld.class);
        System.out.println(helloWorld.getMsg() + " " + helloWorld.getDate());
    }
}