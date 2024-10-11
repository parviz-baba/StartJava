package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[inputPlayerCount(scanner)];
        inputPlayerNames(playerNames, scanner);
        GuessNumber game = new GuessNumber(playerNames);
        String playerChoice = "yes";
        do {
            if (playerChoice.equals("yes")) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
            } else {
                System.out.println("Введите корректный ответ [yes/no]: ");
            }
            playerChoice = scanner.nextLine().toLowerCase();
        } while (!playerChoice.equals("no"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }

    private static int inputPlayerCount(Scanner scanner) {
        boolean isValidInput = false;
        int count = 0;
        do {
            try {
                System.out.println("Введите количество игроков: ");
                count = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число.");
            }
        } while (!isValidInput);
        return count;
    }

    private static void inputPlayerNames(String[] playerNames, Scanner scanner) {
        for (int i = 0; i < playerNames.length; i++) {
            while (true) {
                System.out.println("Введите имя " + (i + 1) + "-го игрока: ");
                String input = scanner.nextLine();
                if (input.matches("[a-zA-Zа-яА-Я]+")) {
                    playerNames[i] = input;
                    break;
                }
                System.out.println("Ошибка: имя должно содержать только " +
                        "буквы русского или английского алфавита. Попробуйте ещё раз.");
            }
        }
    }
}