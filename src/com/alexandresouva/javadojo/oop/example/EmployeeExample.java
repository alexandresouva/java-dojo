package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Employee;

public class EmployeeExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Goku");
        employee.setAge(30);
        employee.setSalaries(new double[]{2000, 3000, 5000});

        employee.printDetails();
    }
}
