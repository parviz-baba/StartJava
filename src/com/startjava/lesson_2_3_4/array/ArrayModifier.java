package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayModifier {
    public static void main(String[] args) {
        float[] randomFloats = new float[15];
        Random random = new Random();
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            System.out.println("\nАдрес: " + address);
            for (int i = 0; i < randomFloats.length; i++) {
                randomFloats[i] = random.nextFloat();
            }
            System.out.println("\nИсходный массив:");
            printArray(randomFloats);
            if (address >= 0 && address < randomFloats.length) {
                double threshold = randomFloats[address];
                System.out.println("Элемент по указанному адресу: " + address +
                        ", Значение: " + String.format("%.3f", threshold));
                int zeroedCount = removeGreaterElements(randomFloats, address);
                System.out.println("Измененный массив:");
                printArray(randomFloats);
                System.out.println("Количество обнуленных элементов: " + zeroedCount);
            } else {
                System.out.println("Ошибка: Неверный адрес. За пределами границы массива.");
            }
        }
    }

    private static void printArray(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            System.out.printf("%.3f ", randomFloats[i]);
            if (i + 1 == 8) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static int removeGreaterElements(float[] randomFloats, int address) {
        double threshold = randomFloats[address];
        int zeroedCount = 0;
        for (int i = 0; i < randomFloats.length; i++) {
            if (randomFloats[i] > threshold) {
                randomFloats[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }
}