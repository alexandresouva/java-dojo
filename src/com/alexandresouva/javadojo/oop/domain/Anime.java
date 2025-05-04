package com.alexandresouva.javadojo.oop.domain;

public class Anime {
    private String name;
    private int episodes;
    private double rating;
    private String genre;

    public Anime(String name, int episodes, double rating) {
        this.name = name;
        this.episodes = episodes;
        this.rating = rating;
        this.genre = "Action";
    }

    public Anime(String name, int episodes, double rating, String genre) {
        this(name, episodes, rating );
        this.genre = genre;
    }

    public void printDetails() {
        System.out.println("Anime data:");
        System.out.println("Name: " + this.name);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Rating: " + this.rating);
        System.out.println("Genre: " + this.genre );
    }

    // ------------------------------------//
    // 🚩 Important notes:

    // - Constructor:
    //   Special method called when creating the object (using "new").
    //   It has no return type and usually initializes fields.

    // - Default constructor:
    //   If no constructor is written, Java automatically provides an empty (no-arg) constructor.

    // - Overloading:
    //   When multiple constructors or methods have the same name but different signatures.
    //   Signature = method name and parameters (order and types)

    // - Overloaded constructor with "this()":
    //   Calls another constructor in the same class.
    //   Must be the *first* statement in the constructor.
    //   Only works inside constructors.
}
