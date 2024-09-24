package com.startjava.lesson_2_3_4.hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private final String wordToGuess;
    private final char[] guessedLetter;
    private final int maxAttempts;
    private final String[] hangmanStages = {
            "     +---+\n     |   |\n         |\n         |\n         |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n         |\n         |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n     |   |\n         |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n    /|   |\n         |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n    /|\\  |\n         |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n    /|\\  |\n    /    |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А",
            "     +---+\n     |   |\n     O   |\n    /|\\  |\n    / \\  |\n         |\n  " +
                    "===============\n  В И С Е Л И Ц А"
    };

    public HangmanGame() {
        Random rand = new Random();
        String[] wordList = {"ВИСЕЛИЦА", "КАЛЬКУЛЯТОР", "МАССИВ", "ПРОГРАММИРОВАНИЕ"};
        wordToGuess = wordList[rand.nextInt(wordList.length)];
        guessedLetter = new char[wordToGuess.length()];
        Arrays.fill(guessedLetter, '_');
        maxAttempts = hangmanStages.length - 1;
    }

    void play() {
        Scanner scanner = new Scanner(System.in, "CP866");
        char[] wrongLetter = new char[maxAttempts];
        int wrongGuessCount = 0;
        int remainingAttempts = maxAttempts;
        while (remainingAttempts > 0) {
            System.out.println(hangmanStages[wrongGuessCount]);
            System.out.println("Загаданное слово: " + String.valueOf(guessedLetter));
            System.out.print("Неправильно угаданные буквы: ");
            for (int i = 0; i < wrongGuessCount; i++) {
                System.out.print(wrongLetter[i] + " ");
            }
            System.out.println("\nОсталось попыток: " + remainingAttempts);
            System.out.print("Введите букву: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (!isCyrillicLetter(guess)) {
                System.out.println("Вы можете использовать только кириллический алфавит.");
                continue;
            }
            if (Character.isLetter(guess)) {
                if (isAlreadyGuessed(guess, wrongLetter, guessedLetter)) {
                    System.out.println("Вы уже вводили эту букву. Введите другую.");
                } else if (wordToGuess.contains(String.valueOf(guess))) {
                    boolean found = false;
                    for (int i = 0; i < wordToGuess.length(); i++) {
                        if (wordToGuess.charAt(i) == guess) {
                            guessedLetter[i] = guess;
                            found = true;
                        }
                    }
                    if (found) {
                        if (wrongGuessCount > 0) {
                            wrongGuessCount--;
                        }
                        remainingAttempts = Math.min(maxAttempts, remainingAttempts + 1);
                        System.out.println("Правильно! Удалена часть виселицы.");
                    }
                } else {
                    wrongLetter[wrongGuessCount] = guess;
                    wrongGuessCount++;
                    remainingAttempts--;
                    System.out.println("Неправильно! Добавлена часть виселицы.");
                }
            } else {
                System.out.println("Введите только букву!");
            }
            if (String.valueOf(guessedLetter).equals(wordToGuess)) {
                System.out.println("Поздравляем! Слово: " + wordToGuess);
                return;
            }
        }
        System.out.println(hangmanStages[maxAttempts]);
        System.out.println("Вы проиграли! Загаданное слово: " + wordToGuess);
    }

    private boolean isAlreadyGuessed(char guess, char[] wrongLetter, char[] guessedLetter) {
        for (char value : wrongLetter) {
            if (value == guess) {
                return true;
            }
        }
        for (char c : guessedLetter) {
            if (c == guess) {
                return true;
            }
        }
        return false;
    }

    private boolean isCyrillicLetter(char letter) {
        return letter >= 'А' && letter <= 'Я';
    }
}