package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static final int expectedPartsLength = 2;

    public static double calculate(String expression) {
        expression = expression.replaceAll("\\s+", "");
        String[] parts = expression.split("(?<=[-+*/%^])|(?=[-+*/%^])");
        if (parts.length != expectedPartsLength + 1) {
            throw new RuntimeException("Ошибка: выражение должно содержать два операнда и один оператор.");
        }
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);
        char operator = parts[1].charAt(0);

        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено.");
                    yield Double.NaN;
                }
                yield num1 / num2;
            }
            case '^' -> {
                if (num1 != (int) num1 || num2 != (int) num2) {
                    System.out.println("Ошибка: числа для возведения в степень должны быть целыми.");
                    yield Double.NaN;
                }
                yield Math.pow(num1, num2);
            }
            case '%' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено.");
                    yield Double.NaN;
                }
                yield num1 % Math.abs(num2);
            }
            default -> {
                System.out.println("Ошибка: операция " + operator + " не поддерживается.");
                yield Double.NaN;
            }
        };
    }

    static char getOperator(String expression) {
        for (char ch : expression.toCharArray()) {
            if ("+-*/%^".indexOf(ch) != -1) {
                return ch;
            }
        }
        throw new RuntimeException("Ошибка: неверный оператор.");
    }
}