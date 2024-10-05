package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] guesses = new int[10];
    private int attempt = 0;
    private static int guess;

    public Player(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public String getName() {
        return name;
    }

    public void setGuess(String input) {
        try {
            int guess = Integer.parseInt(input);
            if (guess < GuessNumber.MIN_NUMBER || guess > GuessNumber.MAX_NUMBER) {
                System.out.println("Число должно входить в отрезок [" + GuessNumber.MIN_NUMBER + ", " +
                        GuessNumber.MAX_NUMBER + "]." + "\nПопробуйте еще раз: ");
            } else {
                Player.guess = guess;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введённая строка не является числом. Попробуйте ещё раз:");
        }
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
        for (int i = 0; i < attempt; i++) {
            guesses[i] = 0;
        }
        attempt = 0;
    }
}