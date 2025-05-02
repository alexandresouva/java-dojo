package com.alexandresouva.javadojo.oop.domain;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void applyDiscount(double percentage) {
        System.out.println("Original price: $" + this.price);
        double discountAmount = this.price * percentage / 100;
        this.price -= discountAmount;

        System.out.println("Discount of " + percentage + "% applied.");
        System.out.println("New price: $" + this.price);
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - this:
    //   Refers to the current instance of the object.
    //   Used to differentiate between fields and parameters.
}
