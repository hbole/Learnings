package com.harshit.configByJavaCode;

import com.harshit.Alien;
import com.harshit.Desktop;
import com.harshit.configByJavaCode.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigByJavaCode {
    public static void runProjectByJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = context.getBean(Alien.class);
        alien.setAge(21);
        System.out.println(alien.getAge());
        alien.code();
//        Code
//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();
    }
}
