package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Anime;

public class AnimeExample {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku no Hero Academia", 12, 9.5, "Fantasy");
        anime.printDetails();
    }
}
