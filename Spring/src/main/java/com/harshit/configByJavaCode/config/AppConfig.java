package com.harshit.configByJavaCode.config;

import com.harshit.Alien;
import com.harshit.Computer;
import com.harshit.Desktop;
import com.harshit.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.harshit")
public class AppConfig {
//    @Bean
//    public Alien alien(Computer computer) {
//        Alien alien = new Alien();
//        alien.setAge(21);
//        alien.setComputer(computer);
//        return alien;
//    }
//
//    @Bean(name = {"com1", "desktop1"})
//    @Primary
////    @Scope("prototype") //Scope to make object creation singleton or prototype
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
