package com.alexandresouva.javadojo.introduction;

import java.util.Random;

public class Operators {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("int a is " + a + " and int b is " + b);

        // 📘 Java Operators: symbols that perform operations on variables and values.

        // ➕ Arithmetic Operators (+, -, *, /, %)
        System.out.println("-----------------------------------");
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));       // + adds values
        System.out.println("Subtraction: " + (a - b));    // - subtracts values
        System.out.println("Multiplication: " + (a * b)); // * multiplies values
        System.out.println("Division: " + (a / b));       // / divides values
        System.out.println("Modulus: " + (a % b));        // % returns remainder

        // ➗ Division behavior
        int intDivision = 10 / 3;         // 3 (integer division discards decimal part)
        double doubleDivision = 10.0 / 3; // 3.333... (double preserves decimal)

        // ------------------------------------//
        // 🧩 Relational (Comparison) Operators
        System.out.println("-----------------------------------");
        System.out.println("Relational (Comparison) Operators");
        System.out.println("Is a equal to b? " + (a == b));  // == checks if values are equal
        System.out.println("Is a not equal to b? " + (a != b));  // != checks if values are different
        System.out.println("Is a greater than b? " + (a > b));   // > greater than
        System.out.println("Is a less than b? " + (a < b));      // < less than
        System.out.println("Is a greater or equal to b? " + (a >= b)); // >= greater or equal
        System.out.println("Is a less or equal to b? " + (a <= b));    // <= less or equal

        // ------------------------------------//
        // 🔗 Logical Operators
        System.out.println("-----------------------------------");
        System.out.println("Logical Operators");
        boolean condition1 = random.nextBoolean();
        boolean condition2 = random.nextBoolean();
        System.out.println("AND (&&): " + (condition1 && condition2)); // true if both are true
        System.out.println("OR (||): " + (condition1 || condition2));  // true if at least one is true
        System.out.println("NOT (!): " + (!condition1));               // inverts the value

        // ✅ Naming convention for boolean variables:
        // - 'is' to indicate a state (e.g., isActive, isAvailable)
        // - 'has' to indicate possession (e.g., hasPermission, hasItems)
        // - 'can' to indicate ability (e.g., canEdit, canDelete)
        // - 'should' to indicate recommendation (e.g., shouldRetry, shouldSave)

        // ------------------------------------//
        // ➡️ Unary Operators
        System.out.println("-----------------------------------");
        System.out.println("Unary Operators");
        int number = 5;
        System.out.println("Positive: " + (+number)); // Positive sign (no effect)
        System.out.println("Negative: " + (-number)); // Negates the value
        System.out.println("Pre-increment: " + (++number)); // Increments then uses the value
        System.out.println("Post-increment: " + (number++)); // Uses the value then increments
        System.out.println("After Post-increment: " + number);
        System.out.println("Pre-decrement: " + (--number)); // Decrements then uses the value
        System.out.println("Post-decrement: " + (number--)); // Uses the value then decrements
        System.out.println("After Post-decrement: " + number);

        // ------------------------------------//
        // ✍️ Assignment Operators
        System.out.println("Assignment Operators");
        a = 10;    // Basic assignment '=': assigns a new value to the variable
        a += 3;    // Compound assignment: a = a + 3
        a -= 2;    // Compound assignment: a = a - 2
        a *= 4;    // Compound assignment: a = a * 4
        a /= 2;    // Compound assignment: a = a / 2
        a %= 3;    // Compound assignment: a = a % 3

        // ------------------------------------//
        // ❓ Ternary Operator
        System.out.println("-----------------------------------");
        System.out.println("Ternary Operator");
        int age = random.nextInt(120);
        String status = (age >= 18) ? "Adult" : "Minor"; // (condition) ? trueResult : falseResult
        System.out.println("Status: " + status);
    }
}
