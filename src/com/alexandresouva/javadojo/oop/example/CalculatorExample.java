package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum(2, 3);

        int subtractResult = calculator.subtract(5, 1);
        System.out.println("Subtract result: " + subtractResult);

        int multiplyResult = calculator.multiply(2, 7);
        System.out.println("Multiply result: " + multiplyResult);
    }
}
