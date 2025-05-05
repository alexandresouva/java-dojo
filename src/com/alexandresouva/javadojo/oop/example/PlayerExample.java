package com.alexandresouva.javadojo.oop.example;

import com.alexandresouva.javadojo.oop.domain.Player;
import com.alexandresouva.javadojo.oop.domain.Team;

public class PlayerExample {
    public static void main(String[] args) {
        Team santos = new Team("Santos");
        Player pele = new Player("Pelé");
        pele.setTeam(santos);
        Player neymar = new Player("Neymar", santos);

        pele.printDetails();
        System.out.println("-----------");
        neymar.printDetails();
    }
}
