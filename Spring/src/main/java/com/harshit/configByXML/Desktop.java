package com.harshit.configByXML;

import com.harshit.configByXML.Computer;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Object Created...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling In Desktop...");
    }
}
