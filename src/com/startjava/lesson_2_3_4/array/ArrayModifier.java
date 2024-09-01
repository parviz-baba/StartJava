package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayModifier {
    public static void main(String[] args) {
        float[] value = new float[15];
        Random random = new Random();
        for (int i = 0; i < value.length; i++) {
            value[i] = random.nextFloat();
        }
        System.out.println("\nИсходный массив:");
        printArray(value);
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            System.out.println("\nAdres: " + address);
            if (address >= 0 && address < value.length) {
                double threshold = value[address];
                System.out.println("Элемент по указанному адресу: " + address +
                        ", Значение: " + String.format("%.3f", threshold));
                int zeroedCount = removeGreaterElements(value, address);
                System.out.println("\nИзмененный массив:");
                printArray(value);
                System.out.println("Количество обнуленных элементов: " + zeroedCount);
            } else {
                System.out.println("Ошибка: Неверный адрес. За пределами границы массива.");
            }
        }
    }

    private static void printArray(float[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.printf("%.3f ", value[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static int removeGreaterElements(float[] value, int address) {
        double threshold = value[address];
        int zeroedCount = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > threshold) {
                value[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }
}