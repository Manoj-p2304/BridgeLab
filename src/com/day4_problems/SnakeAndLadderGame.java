package com.day4_problems;

import java.util.Random;

public class SnakeAndLadderGame {

    public static final int WINNING_POSITION = 100;
    public static final int INITIAL_POSITION = 0;

    public static void main(String[] args) {
        playGameWithSinglePlayer();
        playGameWithTwoPlayers();
    }

    private static void playGameWithSinglePlayer() {
        int playerPosition = INITIAL_POSITION;
        int diceRollCount = 0;

        while (playerPosition < WINNING_POSITION) {
            int diceValue = rollDice();
            int option = checkOption();
            diceRollCount++;

            switch (option) {
                case 0:
                    // No Play
                    break;
                case 1:
                    // Ladder
                    playerPosition += diceValue;
                    break;
                case 2:
                    // Snake
                    playerPosition -= diceValue;
                    break;
            }

            if (playerPosition < 0) {
                playerPosition = INITIAL_POSITION;
            } else if (playerPosition > WINNING_POSITION) {
                playerPosition -= diceValue;
            }

            System.out.println("Dice Roll: " + diceValue + " | Player Position: " + playerPosition);
        }

        System.out.println("Single Player Wins! Dice was rolled " + diceRollCount + " times.");
    }

    private static void playGameWithTwoPlayers() {
        int player1Position = INITIAL_POSITION;
        int player2Position = INITIAL_POSITION;
        int diceRollCountPlayer1 = 0;
        int diceRollCountPlayer2 = 0;

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            int diceValuePlayer1 = rollDice();
            int optionPlayer1 = checkOption();
            diceRollCountPlayer1++;

            int diceValuePlayer2 = rollDice();
            int optionPlayer2 = checkOption();
            diceRollCountPlayer2++;

            switch (optionPlayer1) {
                case 0:
                    // No Play
                    break;
                case 1:
                    // Ladder
                    player1Position += diceValuePlayer1;
                    break;
                case 2:
                    // Snake
                    player1Position -= diceValuePlayer1;
                    break;
            }

            switch (optionPlayer2) {
                case 0:
                    // No Play
                    break;
                case 1:
                    // Ladder
                    player2Position += diceValuePlayer2;
                    break;
                case 2:
                    // Snake
                    player2Position -= diceValuePlayer2;
                    break;
            }

            if (player1Position < 0) {
                player1Position = INITIAL_POSITION;
            } else if (player1Position > WINNING_POSITION) {
                player1Position -= diceValuePlayer1;
            }

            if (player2Position < 0) {
                player2Position = INITIAL_POSITION;
            } else if (player2Position > WINNING_POSITION) {
                player2Position -= diceValuePlayer2;
            }

            System.out.println("Player 1: Dice Roll - " + diceValuePlayer1 + " | Position - " + player1Position);
            System.out.println("Player 2: Dice Roll - " + diceValuePlayer2 + " | Position - " + player2Position);
        }

        if (player1Position >= WINNING_POSITION) {
            System.out.println("Player 1 Wins! Dice was rolled " + diceRollCountPlayer1 + " times.");
        } else {
            System.out.println("Player 2 Wins! Dice was rolled " + diceRollCountPlayer2 + " times.");
        }
    }

    private static int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    private static int checkOption() {
        return new Random().nextInt(3);
    }
}
