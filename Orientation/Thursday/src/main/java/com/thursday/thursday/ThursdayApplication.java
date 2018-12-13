package com.thursday.thursday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThursdayApplication implements CommandLineRunner {
    @Autowired
    Printer printer;
    @Autowired
    @Qualifier("blue")
    MyColor blueColor;


    public static void main(String[] args) {
        SpringApplication.run(ThursdayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(blueColor.printColor());
    }
}

