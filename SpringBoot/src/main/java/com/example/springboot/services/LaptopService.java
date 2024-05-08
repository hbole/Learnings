package com.example.springboot.services;

import com.example.springboot.models.Laptop;
import com.example.springboot.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
        System.out.println("Laptop added...");
    }
}
