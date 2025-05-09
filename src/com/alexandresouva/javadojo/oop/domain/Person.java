package com.alexandresouva.javadojo.oop.domain;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Person: " + this.name + ", Age: " + this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - Inheritance:
    //   Used to inherit/extend properties and methods from another class.
    //   Creates strong coupling between classes.

    // - Private methods:
    //   Are not inherited by subclasses.

    // - Protected:
    //   Accessible by subclasses and classes in the same package.

    // - Multiple inheritance:
    //   Not supported in Java (a class can only extend one class).

    // - Object
    //   Every class in Java implicitly extends Object
}
