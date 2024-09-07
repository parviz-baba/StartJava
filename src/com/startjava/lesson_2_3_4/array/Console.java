package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Arrays.calculateFactorial;

public class Console {
    static void printArray(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            System.out.printf("%.3f ", randomFloats[i]);
            if (i + 1 == 8) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static void printFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Массив нулевой длины");
            return;
        }
        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен.");
            } else {
                results[i] = calculateFactorial(number);
                System.out.println(formatResult(number, results[i]));
            }
        }
        System.out.println("Массив результатов: ");
        for (long result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

    private static String formatResult(int number, long result) {
        if (number == 0) return "0! = 1";
        StringBuilder resultString = new StringBuilder(number + "! = ");
        for (int i = 1; i <= number; i++) {
            resultString.append(i);
            if (i < number) resultString.append(" * ");
        }
        if (number > 1) {
            resultString.append(" = ").append(result);
        }
        return resultString.toString();
    }

    static void displayArray(String message, int[] toReverse) {
        System.out.print(message + "[");
        for (int i = 0; i < toReverse.length; i++) {
            System.out.print(toReverse[i]);
            if (i < toReverse.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static void printTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правая граница (%d)\n", (int) start, (int) end);
            return;
        }
        char[] symbols = new char[end - start + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = ascending ? (char) (start + i) : (char) (end - i);
        }
        int maxSymbols = symbols.length * 2 - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            int numChars = 2 * i + 1;
            int spaces = (maxSymbols - numChars) / 2;
            sb.append(" ".repeat(spaces)).append(String.valueOf(symbols[i]).repeat(numChars)).append(("\n"));
        }
        System.out.print(sb);
    }
}