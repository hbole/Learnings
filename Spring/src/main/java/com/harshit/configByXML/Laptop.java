package com.harshit.configByXML;

import com.harshit.configByXML.Computer;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object Created...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling In Laptop...");
    }
}
