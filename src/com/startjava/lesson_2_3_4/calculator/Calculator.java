package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

class Calculator {
    public static String calculate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        if (expression.length() < 3) {
            throw new RuntimeException("Ошибка: выражение должно содержать два операнда и один оператор.");
        }
        String operator = expression.replaceAll("[^+\\-*/%^]", "");
        if (operator.isEmpty()) {
            throw new RuntimeException("Ошибка: неверный оператор.");
        }
        String[] parts = expression.split("[+\\-*/%^]");
        try {
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            DecimalFormat df = new DecimalFormat("#.###");
            double result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        throw new RuntimeException("Ошибка: деление на ноль запрещено.");
                    }
                    yield num1 / num2;
                }
                case "^" -> Math.pow(num1, num2);
                case "%" -> {
                    if (num2 == 0) {
                        throw new RuntimeException("Ошибка: деление на ноль запрещено.");
                    }
                    yield num1 % num2;
                }
                default -> throw new RuntimeException("Ошибка: операция " + operator + " не поддерживается.");
            };
            return (result == (long) result) ? String.valueOf((long) result) : df.format(result);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка: оба операнда должны быть числами.");
        }
    }
}