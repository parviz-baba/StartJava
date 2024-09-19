package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    private static final int MAX_ATTEMPTS = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        resetPlayers();
        generateNewTarget();
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        Player currentPlayer = player1;
        while (true) {
            if (checkPlayerAttempts(currentPlayer)) {
                currentPlayer = switchPlayer(currentPlayer);
                continue;
            }
            makeGuess(currentPlayer);
            if (player1.getAttempt() >= MAX_ATTEMPTS && player2.getAttempt() >= MAX_ATTEMPTS) {
                System.out.println("У обоих игроков закончились попытки!");
                printPlayerGuesses();
                return;
            }
        }
    }

    private void resetPlayers() {
        player1.resetGuesses();
        player2.resetGuesses();
    }

    private void generateNewTarget() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }

    private boolean checkPlayerAttempts(Player player) {
        if (player.getAttempt() >= MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return true;
        }
        return false;
    }

    private void makeGuess(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(currentPlayer.getName() + ", угадай число: ");
        int guess = scanner.nextInt();
        currentPlayer.addGuess(guess);
        if (guess == targetNumber) {
            System.out.println(currentPlayer.getName() + " угадал число " +
                    guess + " с " + currentPlayer.getAttempt() + "-й попытки!");
            printPlayerGuesses();
            return;
        }
        System.out.println(guess + (guess > targetNumber ? " больше" : " меньше") +
                " того, что загадал компьютер");
    }

    private Player switchPlayer(Player currentPlayer) {
        return (currentPlayer == player1) ? player2 : player1;
    }

    private void printPlayerGuesses() {
        System.out.println(player1.getName() + ": " + guessesToString(player1.getGuesses()));
        System.out.println(player2.getName() + ": " + guessesToString(player2.getGuesses()));
    }

    private String guessesToString(int[] guesses) {
        StringBuilder result = new StringBuilder();
        for (int guess : guesses) {
            result.append(guess).append(" ");
        }
        return result.toString().trim();
    }
}