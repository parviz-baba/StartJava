package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    private static final int EXPECTED_PARTS_LENGTH = 2;

    public static double calculate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        String[] parts = expression.split("[+\\-*/%^]");
        if (parts.length != EXPECTED_PARTS_LENGTH) {
            throw new RuntimeException("Ошибка: выражение должно содержать два операнда и один оператор.");
        }
        try {
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            char operator = getOperator(expression);
            return switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        throw new RuntimeException("Ошибка: деление на ноль запрещено.");
                    }
                    yield num1 / num2;
                }
                case "^" -> {
                    if (num1 != (int) num1 || num2 != (int) num2) {
                        throw new RuntimeException("Ошибка: числа для возведения в степень должны быть целыми.");
                    }
                    yield Math.pow(num1, num2);
                }
                case "%" -> {
                    if (num2 == 0) {
                        throw new RuntimeException("Ошибка: деление на ноль запрещено.");
                    }
                    yield Math.IEEEremainder(num1, num2);
                }
                default -> throw new RuntimeException("Ошибка: операция " + operator + " не поддерживается.");
            };
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка: оба операнда должны быть числами.");
        }
    }

    private static char getOperator(String expression) {
        for (char ch : expression.toCharArray()) {
            if ("+-*/%^".indexOf(ch) != -1) {
                return ch;
            }
        }
        throw new RuntimeException("Ошибка: неверный оператор.");
    }
}