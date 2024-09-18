package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        while (game.getAttempts() < game.getMaxAttempts()) {
            System.out.println("Загаданное слово: " + String.valueOf(game.getGuessedWord()));
            System.out.print("Неправильно угаданные буквы: ");
            for (int i = 0; i < game.getWrongGuessCount(); i++) {
                System.out.print(game.getWrongGuesses()[i] + " ");
            }
            System.out.println("\nОсталось попыток: " + (game.getMaxAttempts() - game.getAttempts()));
            System.out.print("Введите букву: ");
            char guess = scanner.next().toUpperCase().charAt(0);
            if (Character.isLetter(guess)) {
                if (game.isAlreadyGuessed(guess)) {
                    System.out.println("Вы уже вводили эту букву. Введите другую.");
                } else if (game.getWordToGuess().contains(String.valueOf(guess))) {
                    game.updateGuessedWord(guess);
                } else {
                    game.getWrongGuesses()[game.getWrongGuessCount()] = guess;
                    game.incrementWrongGuessCount();
                    game.incrementAttempts();
                    System.out.println("Неправильно! Добавлена часть виселицы.");
                }
            } else {
                System.out.println("Введите только букву!");
            }
            if (game.isWordGuessed()) {
                System.out.println("Поздравляем! Слово: " + game.getWordToGuess());
                return;
            }
        }
        System.out.println("Вы проиграли! Загаданное слово: " + game.getWordToGuess());
    }
}