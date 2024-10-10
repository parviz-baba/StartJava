package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private static final int MAX_GUESSES = 10;
    final int[] guesses = new int[MAX_GUESSES];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int setGuess(String input) {
        try {
            int guess = Integer.parseInt(input);
            if (guess < GuessNumber.MIN_NUMBER || guess > GuessNumber.MAX_NUMBER) {
                System.out.println("Число должно входить в отрезок [" +
                        GuessNumber.MIN_NUMBER + ", " + GuessNumber.MAX_NUMBER + "]." + "\nПопробуйте еще раз: ");
            } else {
                return guess;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введённая строка не является числом. Попробуйте ещё раз:");
        }
        return 0;
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

    public void clear() {
        Arrays.fill(guesses, 0, attempt, 0);
        attempt = 0;
    }
}