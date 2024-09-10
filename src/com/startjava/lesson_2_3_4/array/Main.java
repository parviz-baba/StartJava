package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Arrays.*;
import static com.startjava.lesson_2_3_4.array.Console.*;

public class Main {
    public static void main(String[] args) {
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            printMessage("\nАдрес: " + address + "\n");
            float[] randomFloats = generateRandomFloats(15);
            printMessage("Исходный массив:");
            printArray(randomFloats);
            if (address >= 0 && address < randomFloats.length) {
                printMessage("Элемент по указанному адресу: " + address +
                        ", Значение: " + String.format("%.3f", randomFloats[address]) +
                        "\nИзмененный массив:");
                int zeroedCount = removeGreaterElements(randomFloats, address);
                printArray(randomFloats);
                printMessage("Количество обнуленных элементов: " + zeroedCount);
            } else {
                System.out.println("Ошибка: Неверный адрес. За пределами границы массива.\n");
            }
        }
    }
}