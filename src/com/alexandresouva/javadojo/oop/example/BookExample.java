package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Book;

public class BookExample {
    public static void main(String[] args) {
        Book theHobbit = new Book("The Hobbit", "J. R. R. Tolkien", 12.99);
        theHobbit.printDetails();
        System.out.println("-----------");

        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 14.99);
        harryPotter.printDetails();
        System.out.println("-----------");

        Book.printTotalBooks();
    }
}
