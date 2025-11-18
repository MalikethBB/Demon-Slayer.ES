package com;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void intro() {
        System.out.println("Hey! I'm " + name + " and I'm " + age + " years old.");
    }
}
