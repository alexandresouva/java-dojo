package com.alexandresouva.javadojo.introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // 📘 There are 8 primitive types, each one occupies a fixed amount of memory.

        // 🧮 Integer types (4): byte, short, int, long
        byte smallNumber = 127;            // 1 byte: -128 to 127
        short mediumNumber = 32_000;       // 2 bytes: -32,768 to 32,767
        int age = 20;                      // 4 bytes: -2^31 to 2^31 - 1
        long population = 8_000_000_000L;  // 8 bytes: -2^63 to 2^63 - 1, add 'L' suffix

        // 🔢 Floating-point types (2): float, double
        float height = 1.75F;   // 4 bytes: ~±3.4e38 (7 decimal digits precision), add 'f' suffix
        double weight = 68.9;   // 8 bytes: ~±1.7e308 (15 decimal digits precision), default for decimals

        // 🔤 Character type (1): char
        char initial = 'A';  // 2 bytes: 0 to 65,535 (stores UTF-16 code units / Unicode characters), using single

        // 🔘 Boolean type (1): boolean
        boolean isAdult = true; // 1 bit (conceptually): only two possible values — true or false

        // ------------------------------------//
        // 🚨CASTING: convert one type to another


        // Widening Casting (implicit casting, automatic)
        // Java automatically converts smaller types to larger types.
        int myInt = 10;
        long myLong = myInt;  // 'myInt' is automatically converted to 'long' (implicit casting)

        // Narrowing Casting (explicit casting, manual)
        // The programmer needs to ask for the conversion, which can result in data loss.
        double myDouble = 9.78;
        int myIntCast = (int) myDouble;  // Explicit conversion from 'double' to 'int', losing the decimal part
    }
}
