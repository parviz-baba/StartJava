package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static final int EXPECTED_PARTS_LENGHT = 3;

    public static double calculate(String expression) {
        expression = expression.replaceAll("\\s+", " ").trim();
        String[] parts = expression.split(" ");
        if (parts.length != EXPECTED_PARTS_LENGHT) {
            throw new RuntimeException("Ошибка: выражение должно содержать два операнда и один оператор.");
        }
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка: операнды должны быть целыми числами.");
        }
        char operator = parts[1].charAt(0);
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '^' -> Math.pow(num1, num2);
            case '/', '%' -> {
                if (num2 == 0) {
                    throw new RuntimeException("Ошибка: деление на ноль запрещено.");
                }
                yield (operator == '/') ? ((double) num1 / num2) : (Math.floorMod(num1, num2));
            }
            default -> throw new RuntimeException("Ошибка: операция " + operator + " не поддерживается.");
        };
    }
}