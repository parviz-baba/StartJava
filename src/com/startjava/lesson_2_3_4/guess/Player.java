package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] guesses = new int[GuessNumber.MAX_ATTEMPTS];
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

    public int setGuess(int guess) {
        try {
            if (guess < GuessNumber.MIN_NUMBER || guess > GuessNumber.MAX_NUMBER) {
                System.out.println("Число должно входить в отрезок [" +
                        GuessNumber.MIN_NUMBER + ", " + GuessNumber.MAX_NUMBER + "]." + "\nПопробуйте еще раз: ");
            } else {
                addGuess(guess);
                return guess;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введённая строка не является числом. Попробуйте ещё раз:");
        }
        return 0;
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