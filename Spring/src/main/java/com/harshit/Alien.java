package com.harshit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;

//    @Autowired //Field Injection
//    @Qualifier("laptop")
    private Computer computer;

//    public Alien() {
//        System.out.println("Alien Object Created...");
//    }

//    public Alien(int age) {
//        System.out.println("Para constructor called...");
//        this.age = age;
//    }

//    @ConstructorProperties({"age", "computer"}) //For XML
//    @Autowired //Constructor Injection for config
//    public Alien(int age, Computer computer) {
//        System.out.println("Double para constructor called...");
//        this.age = age;
//        this.computer = computer;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired //Setter Injection
//    @Qualifier("desktop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        System.out.println("Coding...");
        computer.compile();
    }
}
