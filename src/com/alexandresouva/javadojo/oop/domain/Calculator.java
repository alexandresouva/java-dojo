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
    // - Return types: void (no return) vs int (returns value)
    // - Param passing:
    //   - Primitives: passed by value (copied)
    //   - References: passed by reference (copy of reference)
    // - Immutability:
    //   - Primitives are immutable.
    //   - Objects can be mutable or immutable.
    // - Imports:
    //   - No need to import classes from the same package.
    // - Method design tip:
    //   - If method has more than 3 params, consider refactoring.
}
