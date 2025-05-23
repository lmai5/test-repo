package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Person() {}
    public Person(String name) { this.name = name; }

    public String getName() { return name; }
}
