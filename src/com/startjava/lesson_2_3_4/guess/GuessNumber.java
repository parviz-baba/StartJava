package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUNDS = 3;
    private Player[] players;
    private final int[] playerWins;
    private int targetNumber;

    public GuessNumber(String[] playerNames) {
        players = new Player[playerNames.length];
        playerWins = new int[playerNames.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + MAX_ATTEMPTS + " попыток.");
        shufflePlayers(players);
        int round = 1;
        while (round <= MAX_ROUNDS) {
            System.out.println("\nРаунд " + round + ":");
            targetNumber = generateNewTarget();
            boolean isRoundWon = false;
            for (int i = 0; i < MAX_ATTEMPTS; i++) {
                for (Player player : players) {
                    int guess;
                    do {
                        guess = player.setGuess(inputGuess(player.getName()));
                    } while (guess == 0);

                    if (isGuessed(player)) {
                        System.out.println("Раунд завершён. Победитель: " + player.getName() + "\n");
                        playerWins[getPlayerIndex(player)]++;
                        isRoundWon = true;
                        break;
                    }

                    if (player.getAttempt() == MAX_ATTEMPTS) {
                        System.out.println("У " + player.getName() + " закончились попытки!");
                    }
                }
                if (isRoundWon) break;
                printGuesses(players);
                System.out.println();
            }

            if (!isRoundWon) {
                System.out.println("Количество попыток закончилось! Ничья в раунде.");
            }
            round++;
            resetPlayerGuesses(players);
        }
        printFinalWinner(playerWins, players);
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

    private int inputGuess(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", угадай число: ");
        return scanner.nextInt();
    }

    private boolean isGuessed(Player player) {
        int guess = player.getGuesses()[player.getAttempt() - 1];
        if (guess == targetNumber) {
            System.out.println(player.getName() + " угадал число " + targetNumber +
                    " с " + player.getAttempt() + "-й попытки");
            return true;
        }
        if (guess > targetNumber) {
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

    private int getPlayerIndex(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(player)) {
                return i;
            }
        }
        return -1;
    }

    private void printFinalWinner(int[] playerWins, Player[] players) {
        int maxWins = playerWins[0];
        int winnerIndex = 0;
        boolean isDraw = false;
        for (int i = 1; i < playerWins.length; i++) {
            if (playerWins[i] > maxWins) {
                maxWins = playerWins[i];
                winnerIndex = i;
                isDraw = false;
            } else if (playerWins[i] == maxWins) {
                isDraw = true;
            }
        }
        if (isDraw) {
            System.out.println("После трёх раундов игра закончилась ничьёй.");
        } else {
            System.out.println("Общий победитель: " + players[winnerIndex].getName() +
                    " с " + maxWins + " победами.");
        }
    }
}