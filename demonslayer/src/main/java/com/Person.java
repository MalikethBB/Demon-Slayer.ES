package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Person {
    /** Logger for the Person class. */
    protected static final Logger LOGGER = LogManager.getLogger(Person.class);

    /** Name of the person. */
    private String name;

    /** Age of the person. */
    private int age;

    /**
     * Get method for name.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Get method for age.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Constructs a new Person with a given name and age.
     *
     * @param nameParam Name of the person
     * @param ageParam  Age of the person
     */
    public Person(final String nameParam, final int ageParam) {
        this.name = nameParam;
        this.age = ageParam;

        LOGGER.info("Creating a new Person: " + name
                + " aged " + age);

        if (age < 0) {
            LOGGER.error("Age cannot be a negative number. Provided age: "
                    + age);
        }
    }

    /**
     * Introduces the person by printing their name and age.
     */
    public void intro() {
        System.out.println("Hey! I'm " + name
                + " and I'm " + age + " years old.");
    }
}
