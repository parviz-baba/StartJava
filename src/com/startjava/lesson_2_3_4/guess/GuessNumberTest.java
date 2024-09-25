package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        System.out.println("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();
        GuessNumber game = new GuessNumber(name1, name2, name3);
        String userChoice = "yes";
        do {
            if (userChoice.equalsIgnoreCase("yes")) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                userChoice = scanner.nextLine().toLowerCase();
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
                userChoice = scanner.nextLine().toLowerCase();
            }
        } while (!userChoice.equalsIgnoreCase("no"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }
}