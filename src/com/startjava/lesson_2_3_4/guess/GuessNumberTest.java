package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        String playerChoice = "yes";
        while (playerChoice.equalsIgnoreCase("yes")) {
            game.start();
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            playerChoice = scanner.next();
            if (!playerChoice.equalsIgnoreCase("yes") && !playerChoice.equalsIgnoreCase("no")) {
                System.out.println("Пожалуйста, введите 'yes' или 'no'.");
                playerChoice = scanner.nextLine();
            }
        }
        System.out.println("Игра завершена. Спасибо за игру!");
    }
}