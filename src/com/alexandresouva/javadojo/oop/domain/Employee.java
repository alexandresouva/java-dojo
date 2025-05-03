package com.alexandresouva.javadojo.oop.domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;

    public void printDetails() {
        System.out.println("Employee data:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salaries: " + Arrays.toString(this.salaries));
        System.out.println("Average salary: " + calculateSalaryAverage());
    }

    private double calculateSalaryAverage() {
        if (this.salaries == null) return 0;

        double totalSalary = 0;
        for (Double salary : salaries) {
            totalSalary += salary;
        }
        return totalSalary / salaries.length;

        //   Could be refactored to use streams:
        //   return Arrays.stream(salaries).average().orElse(0);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age should be positive!");
            return;
        }
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        for (double salary : salaries) {
            if (salary < 0) {
                System.out.println("Salary values must be positive.");
                return;
            }
        }
        this.salaries = salaries;
    }

    // ------------------------
    // 🚩 Important notes:

    // - Private:
    //   Encapsulation. Fields are private to hide data and force controlled access via getters/setters.

    // - get (getter):
    //   Provides read access to private fields.

    // - set (setter):
    //   Provides write access, and it's the place to add validation (e.g., age >= 0).

    // - Setter with a builder pattern (method chaining):
    //   Return `this` in the setter to allow chaining multiple calls, like:
    //     employee.setName("Alex").setAge(30);
}
