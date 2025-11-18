package com.example;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.Person;

/**
 * Unit test for the Person class.
 */
public class PersonTest {
    /**
     * Tests that a Person object is created successfully and isn't null.
     */
    @Test
    public void testIntro() {
        Person person = new Person("Tanjiro", 15);
        assertNotNull(person);
    }
}
