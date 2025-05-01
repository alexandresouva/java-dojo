package com.alexandresouva.javadojo.oop.domain;

public class Calculator {
    // Sum method: no return (void), just prints result
    public void sum(int num1, int num2) {
        System.out.println("Sum method");
        System.out.println(num1 + num2);
    }

    // Subtract method: returns result (int)
    public int subtract(int num1, int num2) {
        return num1 - num2; // corrected logic
    }

    // Multiply method: returns result (int)
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - No need to import classes from the same package.
    // - Return types: void (no return) vs int (returns int value)

    // - Param passing:
    //   - Primitives: passed by value (copied)
    //   - References: passed by reference (copy of reference)

    // - Immutability:
    //   - Primitives are immutable:
    //     - The value is replaced when reassigned.
    //     - The variable's memory address (in stack) stays the same, only the value changes.

    // - Objects:
    //   - Reference variables can be reassigned (the reference changes).
    //   - Some classes (like String) are immutable:
    //     - A new object is created when modified (e.g., String concatenation).
    //   - Other objects can be mutable (e.g., ArrayList, custom classes).

    // - Method design tip:
    //   - If method has more than 3 params, consider refactoring.
    //   - Avoid side effects (method should do one thing).
    //   - Prefer returning values instead of modifying parameters (immutability).
    //   - For optional params, consider method overloading or Builder pattern.
}
