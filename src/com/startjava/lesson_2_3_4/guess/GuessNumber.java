package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_ATTEMPTS = 2;
    public static final int MAX_ROUNDS = 3;
    private Player[] players;
    private int targetNumber;

    public GuessNumber(String[] playerNames) {
        players = new Player[playerNames.length];
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
                        guess = player.addGuess(inputGuess(player.getName()));
                    } while (guess == 0);

                    if (isGuessed(player)) {
                        System.out.println("Раунд завершён. Победитель: " + player.getName() + "\n");
                        player.incrementWins();
                        isRoundWon = true;
                        break;
                    }
                    checkAttempt(player);
                }
                if (isRoundWon) break;
                printGuesses();
                System.out.println();
            }

            if (!isRoundWon) {
                System.out.println("Количество попыток закончилось! Ничья в раунде.");
            }
            round++;
            resetPlayerGuesses();
        }
        printFinalWinner();
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
        System.out.println(guess + (guess > targetNumber ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private void resetPlayerGuesses() {
        for (Player player : players) {
            player.clear();
        }
    }

    private static void checkAttempt(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private static void printGuesses() {
        for (Player player : players) {
            System.out.print(player.getName() + ": ");
            for (int guess : player.getGuesses()) {
                System.out.printf("%-4s", guess);
            }
            System.out.println();
        }
    }

    private void printFinalWinner() {
        int maxWins = players[0].getWins();
        Player winner = players[0];
        boolean isDraw = false;
        for (Player player : players) {
            if (player.getWins() > maxWins) {
                maxWins = player.getWins();
                winner = player;
                isDraw = false;
            } else if (player.getWins() == maxWins && player != winner) {
                isDraw = true;
            }
        }
        if (isDraw) {
            System.out.println("После трёх раундов игра закончилась ничьёй.");
        } else {
            System.out.println("Общий победитель: " + winner.getName() +
                    " с " + maxWins + " победами.");
        }
    }
}