package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Student;

public class StudentExample {
    public static void main(String[] args) {
        // 🆕 Object creation:
        // - The `new` keyword allocates space in memory and returns a reference.
        Student student = new Student();

        // 🎯 Assigning values:
        // - Using dot notation to access public fields.
        student.name = "Alexandre";
        student.age = 25;
        student.gender = 'M';

        // 📦 Reference:
        // - `student` is a reference stored in the Stack.
        // - It points to a Student object in the Heap.

        // 🧠 String interning:
        // - "Alexandre" is stored in the String pool.
        // - Reused across different references when declared as literal.
        System.out.println("Student " + student.name + ", age: " + student.age + " and gender " + student.gender);
    }
}
