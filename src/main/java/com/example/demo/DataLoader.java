package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        Car carr;
        carr = new Car("2000","Audi","R8");
        carRepository.save(carr);
        carr= new Car("2019","BMW","I8");
        carRepository.save(carr);
        carr= new Car("2020","Ford","Mustang");
        carRepository.save(carr);
    }
}
