package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] guesses = new int[GuessNumber.MAX_ATTEMPTS];
    private int attempt;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int addGuess(int guess) {
        if (guess < GuessNumber.MIN_NUMBER || guess > GuessNumber.MAX_NUMBER) {
            System.out.println("Число должно входить в отрезок [" +
                    GuessNumber.MIN_NUMBER + ", " + GuessNumber.MAX_NUMBER + "]." + "\nПопробуйте еще раз: ");
            return 0;
        }
        guesses[attempt] = guess;
        attempt++;
        return guess;
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public void incrementWins() {
        wins++;
    }

    public int getWins() {
        return wins;
    }

    public void clear() {
        Arrays.fill(guesses, 0, attempt, 0);
        attempt = 0;
    }
}