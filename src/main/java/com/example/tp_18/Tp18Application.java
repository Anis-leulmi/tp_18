package com.example.tp_18;

import jakarta.servlet.ServletOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp18Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp18Application.class, args);

        System.out.println("Ceci est un test !");
    }

}
