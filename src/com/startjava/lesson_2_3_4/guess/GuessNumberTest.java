package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = false;
        while (!input) {
            try {
                System.out.println("Введите количество игроков: ");
                count = Integer.parseInt(scanner.nextLine());
                input = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число.");
            }
        }
        String[] playersNames = new String[count];
        getPlayerNames(playersNames);
        GuessNumber game = new GuessNumber(playersNames);
        String playerChoice = "yes";
        do {
            if (playerChoice.equalsIgnoreCase("yes")) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            } else {
                System.out.println("Введите корректный ответ [yes/no]: ");
            }
            playerChoice = scanner.nextLine().toLowerCase();
        } while (!playerChoice.equalsIgnoreCase("no"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }

    private static void getPlayerNames(String[] playersNames) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < playersNames.length; i++) {
            while (true) {
                System.out.println("Введите имя " + (i + 1) + "-го игрока: ");
                String input = scanner.nextLine();
                if (input.matches("[a-zA-Zа-яА-Я]+")) {
                    playersNames[i] = input;
                    break;
                } else {
                    System.out.println("Ошибка: имя должно содержать только " +
                            "буквы русского или английского алфавита. Попробуйте ещё раз.");
                }
            }
        }
    }
}
