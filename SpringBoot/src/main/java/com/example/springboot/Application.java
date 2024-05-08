package com.example.springboot;

import com.example.springboot.models.Alien;
import com.example.springboot.models.Laptop;
import com.example.springboot.services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        Laptop laptop = context.getBean(Laptop.class);
        LaptopService laptopService = context.getBean(LaptopService.class);

        laptopService.addLaptop(laptop);

//        Alien alien = context.getBean(Alien.class);
//        alien.code();
    }

}
