package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateNewTarget();
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;

        while (true) {
            System.out.println(currentPlayer.getName() + ", угадай число: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + "! Ты угадал число.");
                return;
            } else {
                if (guess > targetNumber) {
                    System.out.println(guess + " больше того, что загадал компьютер");
                } else {
                    System.out.println(guess + " меньше того, что загадал компьютер");
                }
                System.out.println("Неверно. Попробуй снова.");
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }

    public void generateNewTarget() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }
}