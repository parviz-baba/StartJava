package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static final String[] PLAYER_NAMES = new String[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < PLAYER_NAMES.length; i++) {
            System.out.println("Введите имя " + (i + 1) + "-го игрока: ");
            PLAYER_NAMES[i] = scanner.nextLine();
        }
        GuessNumber game = new GuessNumber(PLAYER_NAMES[0], PLAYER_NAMES[1], PLAYER_NAMES[2]);
        String playerChoice = "yes";
        do {
            if (playerChoice.equalsIgnoreCase("yes")) {
                game.start();
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            playerChoice = scanner.nextLine().toLowerCase();
        } while (!playerChoice.equalsIgnoreCase("no"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }
}