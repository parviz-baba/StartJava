package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";
        while (userChoice.equals("yes")) {
            System.out.println("Введите математическое выражение: ");
            String expression = scanner.nextLine();
            double result = Calculator.calculate(expression);
            System.out.println("Результат: " + result);
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            userChoice = scanner.nextLine();
            while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")) {
                System.out.println("Пожалуйста, введите 'yes' или 'no'.");
                userChoice = scanner.nextLine();
            }
        }
    }
}