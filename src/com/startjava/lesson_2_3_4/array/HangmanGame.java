package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private final String wordToGuess;
    private final char[] guessedWord;
    private final char[] wrongGuesses;
    private int wrongGuessCount;
    private int attempts;
    private final int maxAttempts = 6;

    private HangmanGame() {
        Random rand = new Random();
        String[] wordList = {"PACKAGE", "ARRAYS", "RANDOM", "SCANNER"};
        wordToGuess = wordList[rand.nextInt(wordList.length)];
        guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');
        wrongGuesses = new char[maxAttempts];
        wrongGuessCount = 0;
        attempts = 0;
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (attempts < maxAttempts) {
            System.out.println("Загаданное слово: " + String.valueOf(guessedWord));
            System.out.print("Неправильно угаданные буквы: ");
            for (int i = 0; i < wrongGuessCount; i++) {
                System.out.print(wrongGuesses[i] + " ");
            }
            System.out.println("\nОсталось попыток: " + (maxAttempts - attempts));
            System.out.print("Введите букву: ");
            char guess = scanner.next().toUpperCase().charAt(0);
            if (Character.isLetter(guess)) {
                if (isAlreadyGuessed(guess)) {
                    System.out.println("Вы уже вводили эту букву. Введите другую.");
                } else if (wordToGuess.contains(String.valueOf(guess))) {
                    for (int i = 0; i < wordToGuess.length(); i++) {
                        if (wordToGuess.charAt(i) == guess) {
                            guessedWord[i] = guess;
                        }
                    }
                } else {
                    wrongGuesses[wrongGuessCount] = guess;
                    wrongGuessCount++;
                    attempts++;
                    System.out.println("Неправильно! Добавлена часть виселицы.");
                }
            } else {
                System.out.println("Введите только букву!");
            }
            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                System.out.println("Поздравляем! Слово: " + wordToGuess);
                return;
            }
        }
        System.out.println("Вы проиграли! Загаданное слово: " + wordToGuess);
    }

    private boolean isAlreadyGuessed(char guess) {
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
}