package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";
        do {
            if (userChoice.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                double result = Calculator.calculate(expression);
                if (!Double.isNaN(result)) {
                    consoleResult(result, expression);
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userChoice = scanner.nextLine();
            }
            if (userChoice.equals("no")) {
                break;
            }
            if (!userChoice.equals("yes")) {
                System.out.println("Введите корректный ответ [yes / no]: ");
                userChoice = scanner.nextLine();
            }
        } while (!"no".equals(userChoice));
    }

    private static void consoleResult(double result, String expression) {
        expression = expression.replaceAll("\\s+", "");
        String[] parts = expression.split("[+\\-*/%^]");
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[1]);
        DecimalFormat df = new DecimalFormat("#.###");
        if (result == (int) result) {
            System.out.println("Результат: " + df.format(num1) + " " +
                    Calculator.getOperator(expression) + " " + df.format(num2) + " = " + (int) result);
        } else {
            System.out.println("Результат: " + df.format(result));
        }
    }
}