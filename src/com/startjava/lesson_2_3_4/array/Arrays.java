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

    public static long[] calculateFactorials(int... numbers) {
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

    private static long calculateFactorial(int number) {
        if (number == 0) return 1;
        long factorial = 1L;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}