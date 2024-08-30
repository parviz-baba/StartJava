package com.startjava.lesson_2_3_4.array;

public class FactorialUtils {
    public static void main(String[] args) {
        printFactorials(new int[]{});
        printFactorials(null);
        printFactorials(8, 0, 9);
        printFactorials(-3, 1, 7, 13);
        printFactorials(-22, -0);
    }

    public static void printFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        } else if (numbers.length == 0) {
            System.out.println("Массив нулевой длины");
            return;
        }
        int[] results = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен.");
                results[i] = -1;
            } else {
                results[i] = calculateFactorialValue(num);
                System.out.println(formatFactorial(num, results[i]));
            }
        }
        System.out.println("Массив результатов: ");
        for (int result : results) {
            if (result != -1) {
                System.out.print(result + " ");
            }
        }
        System.out.println();
    }

    public static int calculateFactorialValue(int number) {
        if (number == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static String formatFactorial(int number, int result) {
        if (number == 0) return "0! = 1";
        String resultString = number + "! = ";
        for (int i = 1; i <= number; i++){
            resultString += i;
            if (i < number) resultString += " * ";
        }
        resultString += " = " + result;
        return resultString;
    }
}