package com.startjava.lesson_2_3_4.array;

public class TriangleSorter {
    public static void main(String[] args) {
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
    }

    private static void printTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правая граница (%d)\n", (int) start, (int) end);
            return;
        }
        char[] symbols = new char[end - start + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = (char) (start + i);
        }
        if (!ascending) reverse(symbols);
        int maxSymbols = symbols.length * 2 - 1;
        for (int i = 0; i < symbols.length; i++) {
            int numChars = 2 * i + 1;
            int spaces = (maxSymbols - numChars) / 2;
            System.out.printf("%" + (spaces + numChars) + "s\n", String.valueOf(symbols[i]).repeat(numChars));
        }
    }

    private static void reverse(char[] toReverse) {
        for (int i = 0; i < toReverse.length / 2; i++) {
            char temp = toReverse[i];
            toReverse[i] = toReverse[toReverse.length - 1 - i];
            toReverse[toReverse.length - 1 - i] = temp;
        }
    }
}