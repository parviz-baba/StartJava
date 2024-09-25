package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] guesses = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void addGuess(int guess) {
        if (attempt < 10) {
            guesses[attempt] = guess;
            attempt++;
        }
    }

    public void reset() {
        Arrays.fill(guesses, 0);  // Clear the array
        attempt = 0;
    }
}