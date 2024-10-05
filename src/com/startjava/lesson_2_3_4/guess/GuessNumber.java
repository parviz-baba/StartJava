package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUND = 3;
    static Player[] players = new Player[GuessNumberTest.count];
    private static int targetNumber;

    public GuessNumber(String[] playersNames) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(playersNames[i]);
        }
    }

    public void start() {
        generateNewTarget();
        System.out.println("\nИгра началась! У каждого игрока по " + MAX_ATTEMPTS + " попыток.");
        shufflePlayers();
        int round = 1;
        while (round <= MAX_ROUND) {
            System.out.println("\nРаунд " + round + ":");
            for (int i = 0; i < MAX_ATTEMPTS; i++) {
                for (Player player : players) {
                    do {
                        player.setGuess(getPlayerGuess(player.getName()));
                    } while (player.getGuess() < GuessNumber.MIN_NUMBER || player.getGuess() > MAX_NUMBER);
                    player.addGuess(player.getGuess());
                    if (checkGuess(player.getGuess(), targetNumber, player.getName(), player.getAttempt())) {
                        System.out.println("Игра завершена. Победитель: " + player.getName() + "\n");
                        resetPlayerGuesses();
                        return;
                    }
                    if (player.getAttempt() == MAX_ATTEMPTS) {
                        System.out.println("У " + player.getName() + " закончились попытки!");
                    }
                }
                printGuesses();
                System.out.println();
            }
            System.out.println("Количество попыток закончилось!");
            round++;
            resetPlayerGuesses();
        }
    }

    private static void generateNewTarget() {
        targetNumber = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }

    private static void shufflePlayers() {
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

    private static void printGuesses() {
        for (Player player : players) {
            System.out.println(player.getName() + ": " + Arrays.toString(player.getGuesses()));
        }
    }

    private static void resetPlayerGuesses() {
        for (Player player : players) {
            player.clear();
        }
    }

    private String getPlayerGuess(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", угадай число: ");
        return scanner.nextLine();
    }

    private boolean checkGuess(int guess, int targetNumber, String name, int attempt) {
        if (guess == targetNumber) {
            System.out.println(name + " угадал число " + targetNumber + " с " + attempt + "-й попытки");
            return true;
        } else if (guess > targetNumber) {
            System.out.println(guess + " больше того, что загадал компьютер");
        } else {
            System.out.println(guess + " меньше того, что загадал компьютер");
        }
        return false;
    }
}