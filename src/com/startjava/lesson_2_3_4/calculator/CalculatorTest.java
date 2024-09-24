package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";
        do {
            if ("yes".equals(userChoice)) {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                try {
                    double result = Calculator.calculate(expression);
                    printResult(result, expression);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            } else {
                System.out.println("Введите корректный ответ [yes / no]: ");
            }
            userChoice = scanner.nextLine().toLowerCase();
        } while (!"no".equals(userChoice));
    }

    private static void printResult(double result, String expression) {
        expression = expression.replaceAll("\\s+", " ").trim();
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Результат: " + expression + " = " + df.format(result));
    }
}