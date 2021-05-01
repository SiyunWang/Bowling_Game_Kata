package com.siyun.bowling;

import java.util.Scanner;

public class App {
    public static Game game = new Game();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Bowling Game");
        // frame 1 - 9
        for (int i = 0; i < 9; i++) {
            int pinsDown;
            int pinsRemaining;
            System.out.println("Roll for Frame " + (i + 1) + " !");
            System.out.println("Please enter 0 - 10 for number of pins down for first roll:");
            pinsDown = scanner.nextInt();
            game.roll(pinsDown);
            if (pinsDown == 10) {
                game.roll(0);
            } else {
                pinsRemaining = 10 - pinsDown;
                System.out.println("Please enter 0 - " + pinsRemaining + " for number of pins down for second roll:");
                pinsDown = scanner.nextInt();
                game.roll(pinsDown);
            }
        }
        // last frame
        System.out.println("Roll for Frame 10 !");
        System.out.println("Please enter 0 - 10 for number of pins down for first roll:");
        int pinsDown = scanner.nextInt();
        int pinsRemaining = 10 - pinsDown;
        game.roll(pinsDown);
        if (pinsDown == 10) {
            System.out.println("Please enter 0 - 10 for number of pins down for second roll:");
        } else {
            System.out.println("Please enter 0 - " + pinsRemaining + " for number of pins down for second roll:");
        }
        pinsDown = scanner.nextInt();
        game.roll(pinsDown);
        if (pinsDown < pinsRemaining) {
            game.roll(0);
        } else {
            System.out.println("Please enter 0 - 10 for number of pins down for last roll:");
            pinsDown = scanner.nextInt();
            game.roll(pinsDown);
        }
        System.out.println("All frames rolled. Calculating score...");
        game.calculateScore();
        System.out.println("Your total score is " + game.getTotalScore());
        System.exit(0);
    }
}
