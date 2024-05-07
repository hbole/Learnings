package com.harshit.configByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigByXML {
    public static void runProjectConfigByXML() {
        //Creating all the objects
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Creating an object from xml config based context
        Alien alien = context.getBean("alien", Alien.class);
        System.out.println(alien.getAge());
        alien.code();

//        Computer computer = context.getBean(Computer.class);
//        Desktop desktop = context.getBean(Desktop.class);
    }
}
