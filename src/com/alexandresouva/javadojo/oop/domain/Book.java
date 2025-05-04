package com.alexandresouva.javadojo.oop.domain;

public class Book {
    private String title;
    private String author;
    private double price;
    private static int totalBooks;

    static {
        System.out.println("Static block: loading Book class... Initializing total books to 0");
        Book.totalBooks = 0;
    }

    {
        System.out.println("Instance block: initializing book... Incrementing total books by 1");
        Book.totalBooks++;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Book: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
    }

    public static void printTotalBooks() {
        System.out.println("Total books created: " + Book.totalBooks);
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - Static initialization block:
    //   Runs once when the class is loaded (before any object is created).
    //   A class can have multiple static blocks, and they run in order of appearance.

    // - Static attribute:
    //   Belongs to the class, not to the objects.
    //   Shared among all instances. Updated once, seen by all.

    // - Static method:
    //   Belongs to the class, not to instances.
    //   Can only access static fields and other static methods directly.

    // - Instance initialization block:
    //   Block of code inside `{}` (but outside methods/constructors) that runs
    //   every time an object is created. Good for shared setup logic used by all constructors.

    // - Execution order:
    //   1) Static initialization block(s) run (when the class is loaded by JVM).
    //   2) Memory is allocated for the object (fields get default values).
    //   3) Instance variable initialization (fields get default values or assigned values).
    //   4) Instance initialization block (runs every time an object is created).
    //   5) Constructor runs.

}
