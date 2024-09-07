package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Arrays.*;
import static com.startjava.lesson_2_3_4.array.Console.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        printFactorials(new int[]{});
        printFactorials(null);
        printFactorials(8, 0, 9);
        printFactorials(-3, 1, 7, 13);
        printFactorials(-22, -0);
        generateNumbers(-10, 20, 23);
        generateNumbers(-30, 10, 10);
        generateNumbers(-34, -34, 0);
        generateNumbers(1, 2, -3);
        generateNumbers(5, -8, 2);
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
        String[] inputs = {
                "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                        "- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                        "- Robert Martin",
                null,
                ""
        };
        for (String input : inputs) {
            if (input != null && !input.isEmpty()) {
                processString(input);
            } else {
                System.out.println("Пустая или нулевая строка");
            }
        }
    }
}