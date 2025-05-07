package com.alexandresouva.javadojo.exceptions.example;

import com.alexandresouva.javadojo.exceptions.unchecked.DivisionByZeroException;
import com.alexandresouva.javadojo.exceptions.unchecked.InvalidAgeException;

public class UncheckedExceptionsExamples {
    public static void main(String[] args) {
        System.out.println("Process division");
        try {
            processDivision(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Process age");
        try {
            processAge(-1);
        } catch (InvalidAgeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void processDivision(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void processAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Age is valid: " + age);
    }

    // ----------------------------
    // 🚩 Important notes:

    // - Unchecked exceptions
    //   - these are subclasses of RuntimeException
    //   - do not require explicit declaration with 'throws'

    // - try-catch
    //   - Used for handling exceptions
    //   - 'try' block contains code that may throw an exception
    //   - 'catch' block handles the exception if thrown
    //   - Optional 'finally' block executes after 'try' and 'catch', regardless of exception
}
