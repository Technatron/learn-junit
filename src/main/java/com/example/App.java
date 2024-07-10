package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javalord.MathUtil;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        MathUtil mathUtil = new MathUtil();

        // Use the MathUtil instance to perform operations
        int sum = mathUtil.add(2, 3);
        System.out.println("The sum of 2 and 3 is: " + sum);
    }
}