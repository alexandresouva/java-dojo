package com.alexandresouva.javadojo.oop.domain;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); // calls the constructor of the superclass (Person)
        System.out.println("Professor constructor running...");
        this.subject = subject;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // calls the method from the superclass
        System.out.println("Subject: " + this.subject);
    }

    public String getSubject() {
        return subject;
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - super():
    //   Used to access members (methods/attributes) from the superclass.
    //   Always the first statement in the subclass constructor.
    //   Ensures superclass fields are initialized before subclass logic runs.

    // - Overriding:
    //   Subclass replaces the behavior of a method from its superclass.
    //   Rules:
    //     • Must have the same method signature.
    //     • Access modifier must be the same or more permissive.
    //     • Cannot override methods marked as final, static, or private.
    //     • Use @Override annotation to indicate overriding.

    // - Execution order:
    //   1) Static initialization block(s) run for the superclass.
    //   2) Static initialization block(s) run for the subclass.
    //   -- Superclass
    //   3) Memory is allocated for the object (fields get default values).
    //   4) Instance variable initialization (fields get default values or assigned values).
    //   5) Instance initialization block (runs every time an object is created).
    //   6) Constructor runs.
    //   -- Subclass
    //   7) Memory is allocated for the object (fields get default values).
    //   8) Instance variable initialization (fields get default values or assigned values).
    //   9) Instance initialization block (runs every time an object is created).
    //   10) Constructor runs.
}
