package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUNDS = 3;
    private Player[] players;
    private int targetNumber;
    private int guess;

    public GuessNumber(String[] playerNames) {
        players = new Player[playerNames.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
    }

    public void start() {
        targetNumber = generateNewTarget();
        System.out.println("\nИгра началась! У каждого игрока по " + MAX_ATTEMPTS + " попыток.");
        shufflePlayers(players);
        int round = 1;
        while (round <= MAX_ROUNDS) {
            System.out.println("\nРаунд " + round + ":");
            for (int i = 0; i < MAX_ATTEMPTS; i++) {
                for (Player player : players) {
                    do {
                        guess = player.setGuess(getPlayerGuess(player.getName()));
                    } while (guess == 0);
                    player.addGuess(guess);
                    if (checkGuess(player)) {
                        System.out.println("Игра завершена. Победитель: " + player.getName() + "\n");
                        resetPlayerGuesses(players);
                        return;
                    }
                    if (player.getAttempt() == MAX_ATTEMPTS) {
                        System.out.println("У " + player.getName() + " закончились попытки!");
                    }
                }
                printGuesses(players);
                System.out.println();
            }
            System.out.println("Количество попыток закончилось!");
            round++;
            resetPlayerGuesses(players);
        }
    }

    private static int generateNewTarget() {
        return (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }

    private static void shufflePlayers(Player[] players) {
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

    private String getPlayerGuess(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", угадай число: ");
        return scanner.nextLine();
    }

    private boolean checkGuess(Player player) {
        if (guess == targetNumber) {
            System.out.println(player.getName() + " угадал число " + targetNumber +
                    " с " + player.getAttempt() + "-й попытки");
            return true;
        } else if (guess > targetNumber) {
            System.out.println(guess + " больше того, что загадал компьютер");
        } else {
            System.out.println(guess + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private static void resetPlayerGuesses(Player[] players) {
        for (Player player : players) {
            player.clear();
        }
    }

    private static void printGuesses(Player[] players) {
        for (Player player : players) {
            System.out.print(player.getName() + ": ");
            for (int guess : player.getGuesses()) {
                System.out.printf("%-4s", guess);
            }
            System.out.println();
        }
    }
}