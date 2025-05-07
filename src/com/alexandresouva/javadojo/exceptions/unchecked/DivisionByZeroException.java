package com.alexandresouva.javadojo.exceptions.unchecked;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
