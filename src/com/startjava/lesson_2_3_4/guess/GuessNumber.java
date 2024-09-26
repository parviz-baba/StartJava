package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 10;
    private final Player[] players = new Player[3];
    private int targetNumber;

    public GuessNumber(String name1, String name2, String name3) {
        this.players[0] = new Player(name1);
        this.players[1] = new Player(name2);
        this.players[2] = new Player(name3);
    }

    public void start() {
        generateNewTarget();
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        randomPlayersOrder();
        Scanner scanner = new Scanner(System.in);
        int round = 1;
        while (round <= 3 && players[0].getAttempt() < MAX_ATTEMPTS &&
                players[1].getAttempt() < MAX_ATTEMPTS && players[2].getAttempt() < MAX_ATTEMPTS) {
            System.out.println("Раунд " + round + ":");
            for (Player currentPlayer : players) {
                if (currentPlayer.getAttempt() < MAX_ATTEMPTS) {
                    int guess;
                    do {
                        System.out.println(currentPlayer.getName() + ", угадай число: ");
                        guess = scanner.nextInt();
                        if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                            System.out.println("Число должно входить в интервал [" + MIN_NUMBER + ", " +
                                    MAX_NUMBER + "]." + "\nПопробуйте еще раз: ");
                        }
                    } while (guess < MIN_NUMBER || guess > MAX_NUMBER);

                    currentPlayer.addGuess(guess);

                    if (guess == targetNumber) {
                        System.out.println(currentPlayer.getName() + " угадал число " + targetNumber +
                                " с " + currentPlayer.getAttempt() + "-й попытки");
                        return;
                    } else if (guess > targetNumber) {
                        System.out.println(guess + " больше того, что загадал компьютер");
                    } else {
                        System.out.println(guess + " меньше того, что загадал компьютер");
                    }
                }
            }
            round++;
        }
        if (round == 4) {
            System.out.println("Количество раундов закончилось!");
        }
        printGuesses();
        resetPlayerGuesses();
    }

    private void generateNewTarget() {
        targetNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }

    private void randomPlayersOrder() {
        Random random = new Random();
        for (int i = 0; i < players.length; i++) {
            int randomIndex = random.nextInt(players.length);
            Player temp = players[i];
            players[i] = players[randomIndex];
            players[randomIndex] = temp;
        }
        System.out.println("Порядок игроков случайно изменён:");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    private void printGuesses() {
        for (Player player : players) {
            System.out.println(player.getName() + ": " + Arrays.toString(player.getGuesses()));
        }
    }

    private void resetPlayerGuesses() {
        Scanner scanner = new Scanner(System.in);
        for (Player player : players) {
            System.out.println(player.getName() + ", какой номер вы хотите удалить?");
            int guessToClear = scanner.nextInt();
            player.clearGuess(guessToClear);
        }
    }
}