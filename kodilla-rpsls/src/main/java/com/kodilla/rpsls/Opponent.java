package com.kodilla.rpsls;

import java.util.Random;

public class Opponent {

    int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String opponentPick() {
        Random generator = new Random();
        int pick = generator.nextInt(4) + 1;
        System.out.println("Opponent pick: ");
        if (pick == 1) {
            System.out.println("ROCK");
            return "Rock";
        } else if (pick == 2) {
            System.out.println("PAPER");
            return "Paper";
        } else {
            System.out.println("SCISSORS");
            return "Scissors";
        }
    }
}
