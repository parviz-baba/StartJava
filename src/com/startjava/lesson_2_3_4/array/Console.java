package com.startjava.lesson_2_3_4.array;

public class Console {
    static void printMessage(String message) {
        System.out.println(message);
    }

    static void printArray(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            System.out.printf("%.3f ", randomFloats[i]);
            if (i + 1 == 8) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static void printResult(int number, long result) {
        printMessage(formatResult(number, result));
    }

    static void printResultsArray(long[] results) {
        printMessage("Массив результатов: ");
        for (long result : results) {
            printMessage(result + " ");
        }
        printMessage("");
    }

    private static String formatResult(int number, long result) {
        if (number == 0) return "0! = 1";
        StringBuilder resultString = new StringBuilder(number + "! = ");
        for (int i = 1; i <= number; i++) {
            resultString.append(i);
            if (i < number) resultString.append(" * ");
        }
        if (number > 1) {
            resultString.append(" = ").append(result);
        }
        return resultString.toString();
    }

    static void printNumbers(int[] numbers, int countPerLine) {
        if (countPerLine < 1) {
            Console.printMessage("Ошибка: количество чисел в строке не может быть меньше 1 (" + countPerLine + ")");
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%4d ", numbers[i]);
            if ((i + 1) % countPerLine == 0) {
                Console.printMessage("");
            }
        }
        Console.printMessage("");
    }

    static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}