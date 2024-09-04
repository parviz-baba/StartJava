package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class NumberRange {
    public static void main(String[] args) {
        generateNumbers(-10, 20, 23);
        generateNumbers(-30, 10, 10);
        generateNumbers(-34, -34, 0);
        generateNumbers(1, 2, -3);
        generateNumbers(5, -8, 2);
    }

    private static void generateNumbers (int... numbers) {
        int start = numbers[0];
        int end = numbers[1];
        int countPerLine = numbers[2];
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            return;
        }
        int rangeLength = end - start + 1;
        int arrayLength = (int) (rangeLength * 0.75);
        if (arrayLength < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" + arrayLength + ")");
            return;
        }
        if (countPerLine < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" + countPerLine + ")");
            return;
        }
        int[] uniqueNumbers = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            int number;
            boolean isUnique;
            do {
                isUnique = true;
                number = random.nextInt(start, end + 1);
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == number) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = number;
        }
        for (int i = 0; i < uniqueNumbers.length - 1; i++) {
            for (int j = i + 1; j < uniqueNumbers.length; j++) {
                if (uniqueNumbers[i] > uniqueNumbers[j]) {
                    int temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.printf("%4d ", uniqueNumbers[i]);
            if ((i + 1) % countPerLine == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}