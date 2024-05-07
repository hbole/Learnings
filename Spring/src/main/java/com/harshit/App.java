package com.harshit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Creating an object from xml config based context
        Alien alien = (Alien)context.getBean("alien");
        alien.code();
    }
}
