package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyJobRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Running dummy batch job...");
        // Simulate work
        try {
            Thread.sleep(1000); // Simulate 1 second job
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Job complete. Exiting.");
    }
}
