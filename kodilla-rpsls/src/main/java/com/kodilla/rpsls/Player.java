package com.kodilla.rpsls;

import java.util.Scanner;

public class Player {

    String name;
    int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String  getPlayerPick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make your pick: ");
        int pick = scanner.nextInt();
        if (pick == 1) {
            System.out.println("ROCK");
            return "Rock";
        } else if (pick == 2) {
            System.out.println("PAPER");
            return "Paper";
        }else {
            System.out.println("SCISSORS");
            return "Scissors";
        }
    }

}
