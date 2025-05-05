package com.alexandresouva.javadojo.oop.domain;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Team data:");
        System.out.println("Name: " + this.name);
    }

    public String getName() {
        return name;
    }
}
