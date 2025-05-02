package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Car;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.year = 2022;
        car.color = "White";
        car.price = 95000.0;

        car.applyDiscount(15);
    }

    // 🚩 Important notes:

    // - Only declarations are allowed in the class body (outside methods).
    //      e.g., fields, constructors, methods, nested classes.
    // - Code execution (e.g., assignments, method calls) must be inside methods or blocks.

    // - Coupling:
    //   Refers to how much one class depends on another.
    //   - Low coupling (✅ preferred):
    //     Classes know little about each other. Easier to maintain, test, and reuse.
    //   - High coupling (⚠️ avoid):
    //     Classes are tightly connected, changes in one class may break others.

    // ➡️ This example:
    //    ❌ High coupling
    //    Because CarExample directly accesses Car's public fields (brand, model, etc).
    //    ✅ Use private fields in Car and provide public getters and setters.
    //    This way, Car controls its own data, reducing external dependency.
}
