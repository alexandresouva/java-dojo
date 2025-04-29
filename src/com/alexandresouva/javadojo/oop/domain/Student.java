package com.alexandresouva.javadojo.oop.domain;

public class Student {
    public String name; // default: null
    public int age; // default: 0
    public char gender; // default: '\u0000'

    // 📘 Domain class:
    // - Represents a real-world entity in your system.
    // - Used to model state (attributes) and later behavior (methods).

    // 🎯 Cohesion:
    // - Good domain classes have high cohesion: related data and logic together.

    // 🔒 Access modifiers:
    // - No modifier = package-private (accessible only within the same package).

    // 🧠 String pool (interning):
    // - String literals like "Ash" are stored in a common pool.
    // - Multiple variables may point to the same string instance in memory.
    // - Helps save memory and improve performance.

    // 🧠 Object memory:
    // - The object lives in the Heap.
    // - The reference (variable) lives in the Stack.
    // - Each `new Student()` creates a separate memory space.
}
