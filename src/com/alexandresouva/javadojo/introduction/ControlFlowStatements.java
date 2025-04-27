package com.alexandresouva.javadojo.introduction;

import java.util.Random;

public class ControlFlowStatements {
    public static void main(String[] args) {
        Random random = new Random();

        // ------------------------------------//
        // ✅ IF / ELSE IF / ELSE
        System.out.println("IF / ELSE IF / ELSE");
        int age = random.nextInt(120) + 1;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        // ------------------------------------//
        // ✅ SWITCH
        // Java switch supports: int, char, byte, short, String, and enums.
        System.out.println("SWITCH");
        int day = random.nextInt(7) + 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
                break;
        }

        // ------------------------------------//
        // ✅ FOR
        System.out.println("FOR");
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // ------------------------------------//
        // ✅ WHILE
        System.out.println("WHILE");
        int count = 0;
        while (count < 3) {
            System.out.println("While loop count: " + count);
            count++;
        }

        // ------------------------------------//
        // ✅ DO-WHILE
        System.out.println("DO-WHILE");
        int number = 0;
        do {
            System.out.println("Do-While loop number: " + number);
            number++;
        } while (number < 3);

        // ------------------------------------//
        // ✅ BREAK and CONTINUE
        System.out.println("BREAK and CONTINUE");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // skip when i == 2
            }
            if (i == 4) {
                break; // exit loop when i == 4
            }
            System.out.println("Break/Continue example: " + i);
        }
    }
}
