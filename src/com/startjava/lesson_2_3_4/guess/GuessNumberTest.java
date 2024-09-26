package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[3];
        for (int i = 0; i < playerNames.length; i++) {
            System.out.println("Введите имя " + (i + 1) + "-го игрока: ");
            playerNames[i] = scanner.nextLine();
        }
        GuessNumber game = new GuessNumber(playerNames[0], playerNames[1], playerNames[2]);
        String playerChoice = "yes";
        do {
            if (playerChoice.equalsIgnoreCase("yes")) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                playerChoice = scanner.nextLine().toLowerCase();
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
                playerChoice = scanner.nextLine().toLowerCase();
            }
        } while (!playerChoice.equalsIgnoreCase("no"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }
}