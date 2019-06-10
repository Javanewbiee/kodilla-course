package com.kodilla.rpsls;

import java.util.Scanner;

public class Game {

    private Player player;
    private Opponent opponent;
    boolean end;
    boolean x = true;
    boolean n = false;

    public void startGame() {
        System.out.println("Type your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("To how many wins will you play?");
        int wins = scanner.nextInt();

        Player player = new Player(name);
        Opponent opponent = new Opponent();

        System.out.println("Player " + name + " Score: " + player.getScore());
        System.out.println();
        System.out.println("Opponent: Super AI you wont be able to beat" + "\nScore:" + opponent.getScore());

        while (player.getScore() < wins && opponent.getScore() < wins) {
            String playerChoice = player.getPlayerPick();
            String opponentChoice = opponent.opponentPick();
            if (playerChoice == "Rock") {
                if (opponentChoice == "Paper") {
                    System.out.println("Opponent wins this round");
                    int scoreOpponent = opponent.getScore();
                    scoreOpponent++;
                    opponent.setScore(scoreOpponent);
                } else if (opponentChoice == "Scissors") {
                    System.out.println("You win this round");
                    int playerScore = player.getScore();
                    playerScore++;
                    player.setScore(playerScore);
                } else {
                    System.out.println("This round is a draw!");
                }
            } else if (playerChoice == "Paper") {
                if (opponentChoice == "Rock") {
                    System.out.println("You win this round");
                    int playerScore = player.getScore();
                    playerScore++;
                    player.setScore(playerScore);
                } else if (opponentChoice == "Scissors") {
                    System.out.println("Opponent wins this round");
                    int opponentScore = opponent.getScore();
                    opponentScore++;
                    opponent.setScore(opponentScore);
                } else {
                    System.out.println("This round is a draw!");
                }
            } else if (playerChoice == "Scissors") {
                if (opponentChoice == "Rock") {
                    System.out.println("Opponent wins this round");
                    int opponentScore = opponent.getScore();
                    opponentScore++;
                    opponent.setScore(opponentScore);
                } else if (opponentChoice == "Paper") {
                    System.out.println("You win this round");
                    int playerScore = player.getScore();
                    playerScore++;
                    player.setScore(playerScore);
                } else {
                    System.out.println("This round is a draw!");
                }
            }
            System.out.println();
            System.out.println("Player " + player.getName() + " Score: " + player.getScore());
            System.out.println();
            System.out.println("Opponent: Super AI you wont be able to beat" + "\nScore:" + opponent.getScore());
            System.out.println();
        }
        if (player.getScore() > opponent.getScore()) {
            System.out.println("You have won\nGG");
        }else  {
            System.out.println("Your opponent has won\n Told you!");
        }
    }
    public boolean gameEnding() {
        System.out.println("Do you want to end or continue the game?");
        Scanner scan = new Scanner(System.in);
        String gameChoice = scan.nextLine();
        if (gameChoice.equals("x") ) {
            System.out.println("Are you sure you want to end the game?");
            String gameChoice1 = scan.nextLine();
            if (gameChoice1.equals("x")) {
                end = true;
            } else {
                end = false;
            }
        } else {
            end = false;
        }return end;
    }
 }
