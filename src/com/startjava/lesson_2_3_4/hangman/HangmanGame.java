package com.startjava.lesson_2_3_4.hangman;

import java.util.Arrays;
import java.util.Random;

public class HangmanGame {
    private final String wordToGuess;
    private final char[] guessedWord;
    private final char[] wrongGuesses;
    private int wrongGuessCount;
    private int attempts;
    private final int maxAttempts = 6;

    public HangmanGame() {
        Random rand = new Random();
        String[] wordList = {"PACKAGE", "ARRAYS", "RANDOM", "SCANNER"};
        wordToGuess = wordList[rand.nextInt(wordList.length)];
        guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');
        wrongGuesses = new char[maxAttempts];
        wrongGuessCount = 0;
        attempts = 0;
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public char[] getGuessedWord() {
        return guessedWord;
    }

    public char[] getWrongGuesses() {
        return wrongGuesses;
    }

    public int getWrongGuessCount() {
        return wrongGuessCount;
    }

    public int getAttempts() {
        return attempts;
    }

    public void incrementWrongGuessCount() {
        wrongGuessCount++;
    }

    public void incrementAttempts() {
        attempts++;
    }

    public boolean isAlreadyGuessed(char guess) {
        for (int i = 0; i < wrongGuessCount; i++) {
            if (wrongGuesses[i] == guess) {
                return true;
            }
        }
        for (char c : guessedWord) {
            if (c == guess) {
                return true;
            }
        }
        return false;
    }

    public void updateGuessedWord(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = guess;
            }
        }
    }

    public boolean isWordGuessed() {
        return String.valueOf(guessedWord).equals(wordToGuess);
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}