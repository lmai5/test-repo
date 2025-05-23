package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final PersonRepository repo;

    public DemoApplication(PersonRepository repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Running dummy batch job with MySQL...");
        try {
            Person p = new Person("Alice");
            repo.save(p);

            System.out.println("Saved: " + repo.findAll().size() + " person(s).");

            // Optional: Exit after job
        } catch (Exception e) {
            System.out.println("System exit 1");
            System.exit(1);
        }

    }
}
