package com.startjava.lesson_2_3.calculator;

class Calculator {
    public double calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / (double) num2;
                }
                System.out.println("Ошибка: деление на ноль запрещено");
                break;
            case "^":
                return pow(num1, num2);
            case "%":
                if (num2 != 0) {
                    return num1 % num2;
                }
                System.out.println("Ошибка: деление на ноль запрещено");
                break;
            default:
                System.out.println("Ошибка: операция " + operator + " не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
        }
        return Double.NaN;
    }

    private double pow(int a, int b) {
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        result = (b < 0) ? 1 / result : result;
        return result;
    }
}