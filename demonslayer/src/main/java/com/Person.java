package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {

    protected static final Logger logger = LogManager.getLogger(Person.class);

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        logger.info("Creating a new Person: " + name + " aged " + age);

        if (age < 0) {
            logger.error("Age cannot be a negative number. Provided age: " + age);
        }
    }

    public void intro() {
        System.out.println("Hey! I'm " + name + " and I'm " + age + " years old.");
    }
}
