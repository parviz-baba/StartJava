package com.startjava.lesson_2_3_4.array;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            Console.printMessage("\nАдрес: " + address + "\n");
            float[] randomFloats = Arrays.generateRandomFloats(15);
            Console.printMessage("Исходный массив:");
            Console.printArrayFloat(randomFloats);
            if (address >= 0 && address < randomFloats.length) {
                Console.printMessage("Элемент по указанному адресу: " + address +
                        ", Значение: " + String.format("%.3f", randomFloats[address]) +
                        "\nИзмененный массив:");
                int zeroedCount = Arrays.removeGreaterElements(randomFloats, address);
                Console.printArrayFloat(randomFloats);
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
        Arrays.generateRange(-10, 20, 23);
        Arrays.generateRange(-30, 10, 10);
        Arrays.generateRange(-34, -34, 0);
        Arrays.generateRange(1, 2, -3);
        Arrays.generateRange(5, -8, 2);
        Console.formatReverse(new int[0]);
        Console.formatReverse(null);
        Console.formatReverse(new int[]{6, 8, 9, 1});
        Console.formatReverse(new int[]{13, 8, 5, 3, 2, 1, 1});
        char[] triangle = Arrays.createSymbolArray('0', '9', true);
        Console.printTriangle(triangle);
        triangle = Arrays.createSymbolArray('/', '!', false);
        Console.printTriangle(triangle);
        triangle = Arrays.createSymbolArray('A', 'J', false);
        Console.printTriangle(triangle);
        String[] inputs = {
                "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                        "\n- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                        "\n- Robert Martin",
                null,
                ""
        };
        for (String input : inputs) {
            if (input != null && !input.isEmpty()) {
                String[] processedResult = Arrays.modifyString(input);
                Console.printProcessedText(processedResult[0], processedResult[1], processedResult[2]);
            } else {
                Console.printMessage("Пустая или нулевая строка");
            }
        }
    }
}