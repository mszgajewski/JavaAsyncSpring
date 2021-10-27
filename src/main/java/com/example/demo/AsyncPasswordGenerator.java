package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@EnableAsync
@Component
public class AsyncPasswordGenerator {
    private PasswordGenerator passwordGenerator;

    public AsyncPasswordGenerator(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;

    }
    @Async
    public void generateLong() throws InterruptedException {
        System.out.println("A long password: " + passwordGenerator.generate(10));
    }

    @Async
    public void generateShort() throws InterruptedException {
        System.out.println("A short password: " + passwordGenerator.generate(5));
    }


}