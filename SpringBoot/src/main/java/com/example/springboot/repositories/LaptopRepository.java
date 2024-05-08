package com.example.springboot.repositories;

import com.example.springboot.models.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Laptop saved successfully...");
    }
}
