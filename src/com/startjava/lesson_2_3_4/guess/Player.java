package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private static final int[] GUESSES = new int[10];
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
        return Arrays.copyOf(GUESSES, attempt);
    }

    public void addGuess(int guess) {
        if (guess >= 1 && guess <= 100) {
            if (attempt < 10) {
                GUESSES[attempt] = guess;
                attempt++;
            }
        } else {
            System.out.println("Число должно быть от 1 до 100.");
        }
    }

    public void clearGuess(int guess) {
        for (int i = 0; i < attempt; i++) {
            if (GUESSES[i] == guess) {
                GUESSES[i] = 0;
                break;
            }
        }
    }
}