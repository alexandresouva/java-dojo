package com.alexandresouva.javadojo.oop.domain;

public class Player {
    private String name;
    private Team team; // N:1 → Each Player belongs to ONE Team (Many Players -> One Team)

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this(name);
        this.team = team;
    }

    public void printDetails() {
        System.out.println("Player data:");
        System.out.println("Name: " + this.name);
        if (this.team != null) {
            System.out.println("Team: " + this.team.getName());
        }
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    // ------------------------
    // 🚩 Important notes:

    // - Association:
    //   This is an association between Player and Team classes.

    //   Types of association:
    //   - Unidirectional:
    //     Player knows the Team (this case). Team does NOT know the Player list.
    //
    //   - Bidirectional:
    //     Both Player and Team know about each other (would require Team class to have a list of Players).

    //   Cardinality examples:
    //   - 1:1 → One Person has one Passport, and that Passport belongs to that Person.
    //   - 1:N → One Team has many Players.
    //   - N:1 → Many Players belong to the same Team.
    //   - N:N → Many Students can enroll in many Courses, and each Course has many Students.
}
