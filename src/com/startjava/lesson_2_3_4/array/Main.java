package com.startjava.lesson_2_3_4.array;

public class Main {
    public static void main(String[] args) {
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            Console.printMessage("\nАдрес: " + address + "\n");
            float[] randomFloats = Arrays.generateRandomFloats(15);
            Console.printMessage("Исходный массив:");
            Console.printArray(randomFloats);
            if (address >= 0 && address < randomFloats.length) {
                Console.printMessage("Элемент по указанному адресу: " + address +
                        ", Значение: " + String.format("%.3f", randomFloats[address]) +
                        "\nИзмененный массив:");
                int zeroedCount = Arrays.removeGreaterElements(randomFloats, address);
                Console.printArray(randomFloats);
                Console.printMessage("Количество обнуленных элементов: " + zeroedCount);
            } else {
                Console.printMessage("Ошибка: Неверный адрес. За пределами границы массива.\n");
            }
        }
        Arrays.calculateFactorials(new int[]{});
        Arrays.calculateFactorials(null);
        Arrays.calculateFactorials(8, 0, 9);
        Arrays.calculateFactorials(-3, 1, 7, 13);
        Arrays.calculateFactorials(-22, -0);

    }
}