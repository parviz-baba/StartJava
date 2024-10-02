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

    public int getAttempt() {
        return attempt;
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public void addGuess(int guess) {
        guesses[attempt] = guess;
        attempt++;
    }

    public void clearGuess(int guess) {
        for (int i = 0; i < attempt; i++) {
            if (guesses[i] == guess) {
                guesses[i] = 0;
                break;
            }
        }
    }
}