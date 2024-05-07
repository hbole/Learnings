package com.harshit;

import com.harshit.configByXML.Alien;
import com.harshit.configByXML.Computer;
import com.harshit.configByXML.ConfigByXML;
import com.harshit.configByXML.Desktop;
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
        //Creating all the objects
        ConfigByXML.runProjectConfigByXML();
    }
}
