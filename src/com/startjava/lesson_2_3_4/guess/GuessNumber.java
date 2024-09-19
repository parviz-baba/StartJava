package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    private final int maxAttempts = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.resetGuesses();
        player2.resetGuesses();
        generateNewTarget();
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            if (currentPlayer.getAttempt() >= maxAttempts) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки!");
                currentPlayer = switchPlayer(currentPlayer);
                continue;
            }
            System.out.println(currentPlayer.getName() + ", угадай число: ");
            int guess = scanner.nextInt();
            currentPlayer.addGuess(guess);
            if (guess == targetNumber) {
                System.out.println(currentPlayer.getName() + " угадал число " + guess + " с " + currentPlayer.getAttempt() + "-й попытки!");
                printPlayerGuesses();
                return;
            } else {
                if (guess > targetNumber) {
                    System.out.println(guess + " больше того, что загадал компьютер");
                } else {
                    System.out.println(guess + " меньше того, что загадал компьютер");
                }
                System.out.println("Неверно. Попробуй снова.");
                currentPlayer = switchPlayer(currentPlayer);
            }
            if (player1.getAttempt() >= maxAttempts && player2.getAttempt() >= maxAttempts) {
                System.out.println("У обоих игроков закончились попытки!");
                printPlayerGuesses();
                return;
            }
        }
    }

    private Player switchPlayer(Player currentPlayer) {
        return (currentPlayer == player1) ? player2 : player1;
    }

    public void generateNewTarget() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }

    private void printPlayerGuesses() {
        System.out.println(player1.getName() + ": " + arrayToString(player1.getGuesses()));
        System.out.println(player2.getName() + ": " + arrayToString(player2.getGuesses()));
    }

    private String arrayToString(int[] guesses) {
        StringBuilder result = new StringBuilder();
        for (int guess : guesses) {
            result.append(guess).append(" ");
        }
        return result.toString().trim();
    }
}