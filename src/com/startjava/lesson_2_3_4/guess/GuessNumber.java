package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 10;
    private static final Player[] PLAYERS = new Player[3];
    private static int targetNumber = 0;

    public GuessNumber(String name1, String name2, String name3) {
        PLAYERS[0] = new Player(name1);
        PLAYERS[1] = new Player(name2);
        PLAYERS[2] = new Player(name3);
    }

    public void start() {
        generateNewTarget();
        System.out.println("Игра началась! У каждого игрока по " + MAX_ATTEMPTS + " попыток.");
        randomPlayersOrder();
        Scanner scanner = new Scanner(System.in);
        int round = 1;
        while (round <= MAX_ATTEMPTS && PLAYERS[0].getAttempt() < MAX_ATTEMPTS &&
                PLAYERS[1].getAttempt() < MAX_ATTEMPTS && PLAYERS[2].getAttempt() < MAX_ATTEMPTS) {
            System.out.println("Раунд " + round + ":");
            for (Player currentPlayer : PLAYERS) {
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
            if (round > MAX_ATTEMPTS) {
                System.out.println("Количество раундов закончилось!");
            }
        }
        printGuesses();
        resetPlayerGuesses();
        for (Player player : PLAYERS) {
            player.clearAttempts();
        }
    }

    private static void generateNewTarget() {
        targetNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }

    private static void randomPlayersOrder() {
        Random random = new Random();
        for (int i = 0; i < PLAYERS.length; i++) {
            int randomIndex = random.nextInt(PLAYERS.length);
            Player temp = PLAYERS[i];
            PLAYERS[i] = PLAYERS[randomIndex];
            PLAYERS[randomIndex] = temp;
        }
        System.out.println("Порядок игроков случайно изменён:");
        for (Player player : PLAYERS) {
            System.out.println(player.getName());
        }
    }

    private static void printGuesses() {
        for (Player player : PLAYERS) {
            System.out.println(player.getName() + ": " + Arrays.toString(player.getGuesses()));
        }
    }

    private static void resetPlayerGuesses() {
        for (Player player : PLAYERS) {
            player.clear();
        }
    }
}