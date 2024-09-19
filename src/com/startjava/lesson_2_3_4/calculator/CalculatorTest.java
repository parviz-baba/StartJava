package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";

        while (userChoice.equalsIgnoreCase("yes")) {
            try {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                double result = Calculator.calculate(expression);

                consoleResult(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userChoice = scanner.nextLine();
            } while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no"));
        }
        System.out.println("Вычисления завершены.");
    }

    private static void consoleResult(double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        if (result == (int) result) {
            System.out.println("Результат: " + (int) result);
        } else {
            System.out.println("Результат: " + df.format(result));
        }
    }
}