package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[]args) {
        int num1 = 2;
        int num2 = 10;
        char operator = '^';
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("На ноль делить нельзя");
                return;
            }
            result = num1 / num2;
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (operator == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Неверный оператор");
            return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}