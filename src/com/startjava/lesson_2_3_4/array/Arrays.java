package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class Arrays {
    static float[] generateRandomFloats(int lenght) {
        float[] randomFloat = new float[lenght];
        Random random = new Random();
        for (int i = 0; i < randomFloat.length; i++) {
            randomFloat[i] = random.nextFloat();
        }
        return randomFloat;
    }

    static int removeGreaterElements(float[] randomFloats, int address) {
        int zeroedCount = 0;
        for (int i = 0; i < randomFloats.length; i++) {
            if (randomFloats[i] > randomFloats[address]) {
                randomFloats[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }

    static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            Console.printMessage("Массив равен null\n");
            return null;
        }
        if (numbers.length == 0) {
            Console.printMessage("Массив нулевой длины\n");
            return null;
        }
        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                Console.printMessage("Ошибка: факториал " + number + "! не определен.");
            } else {
                results[i] = calculateFactorial(number);
                Console.printResult(number, results[i]);
            }
        }
        Console.printResultsArray(results);
        return results;
    }

    static long calculateFactorial(int number) {
        if (number == 0) return 1;
        long factorial = 1L;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void processRange(int start, int end, int countPerLine) {
        int[] numbers = generateUniqueNumbers(start, end);
        if (numbers != null) {
            Console.printNumbers(numbers, countPerLine);
        }
    }

    static int[] generateUniqueNumbers(int start, int end) {
        if (start > end) {
            Console.printMessage("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            return null;
        }
        int rangeLength = end - start + 1;
        int arrayLength = (int) (rangeLength * 0.75);
        if (arrayLength < 1) {
            Console.printMessage("Ошибка: количество чисел в строке не может быть меньше 1 (" + arrayLength + ")");
            return null;
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
        Console.sortArray(uniqueNumbers);
        return uniqueNumbers;
    }

    static void reverse(int[] toReverse) {
        if (toReverse == null || toReverse.length == 0) {
            Console.printMessage("Массив либо нулевой, либо пустой");
            return;
        }
        Console.displayArray("   До реверса: ", toReverse);
        int len = toReverse.length;
        for (int i = 0; i < len; i++) {
            int temp = toReverse[i];
            toReverse[i] = toReverse[--len];
            toReverse[len] = temp;
        }
        Console.displayArray("После реверса: ", toReverse);
    }

    static char[] createSymbolArray(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правая граница (%d)\n", (int) start, (int) end);
            return new char[0];
        }
        char[] symbols = new char[end - start + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = ascending ? (char) (start + i) : (char) (end - i);
        }
        return symbols;
    }
}