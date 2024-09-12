package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static double calculate(String expression) {
        String[] parts = expression.split("\\s*([\\+\\-\\*/^%])\\s*");
        int num1 = Integer.parseInt(parts[0]);
        String operator = expression.replaceAll("[\\d\\s]", "");
        int num2 = Integer.parseInt(parts[1]);
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    double result = num1 / (double) num2;
                    if (result == (int) result) {
                        return (int) result;
                    } else if (result * 10 == (int)(result * 10)) {
                        return Double.parseDouble(String.format("%.1f", result));
                    } else {
                        return Double.parseDouble(String.format("%.3f", result));
                    }
                }
                System.out.println("Ошибка: деление на ноль запрещено");
                break;
            case "^":
                return Math.pow(num1, num2);
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
}