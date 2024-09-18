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
                double resultt = Calculator.calculate(expression);
                DecimalFormat df = new DecimalFormat("#.###");
                String roundedNumber = df.format(resultt);
                double result = Double.parseDouble(roundedNumber);
                if (result == (int) result) {
                    System.out.println("Результат: " + (int) result);
                } else {
                    System.out.println("Результат: " + result);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")) {
                System.out.println("Введите корректный ответ [yes / no]:");
                userChoice = scanner.nextLine();
            }
            if (userChoice.equalsIgnoreCase("no")) {
                System.out.println("Вычисления завершены.");
                break;
            }
        }
    }
}