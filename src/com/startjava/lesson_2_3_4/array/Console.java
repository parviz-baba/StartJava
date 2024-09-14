package com.startjava.lesson_2_3_4.array;

public class Console {
    static void printMessage(String message) {
        System.out.println(message);
    }

    static void printArrayFloat(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            System.out.printf("%.3f ", randomFloats[i]);
            if (i + 1 == 8) {
                System.out.println();
            }
        }
        printMessage("");
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

    static String formatResult(int number, long result) {
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
            Console.printMessage("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    countPerLine + ")");
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

    public static void printArrayInt(String message, int[] toReverse) {
        System.out.print(message + "[");
        for (int i = 0; i < toReverse.length; i++) {
            System.out.print(toReverse[i]);
            if (i < toReverse.length - 1) {
                System.out.print(", ");
            }
        }
        printMessage("]");
    }

    static void printTriangle(char[] symbols) {
        if (symbols.length == 0) {
            return;
        }
        int maxSymbols = symbols.length * 2 - 1;
        for (int i = 0; i < symbols.length; i++) {
            int numChars = 2 * i + 1;
            int spaces = (maxSymbols - numChars) / 2;
            printMessage(" ".repeat(spaces) + String.valueOf(symbols[i]).repeat(numChars));
        }
    }

    static void displayProcessedText(String shortestWord, String longestWord, String processedText)
            throws InterruptedException {
        printMessage("Самое короткое слово: " + shortestWord + "\n" +
                "Самое длинное слово: " + longestWord + "\n");
        for (char c : processedText.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100);
        }
        printMessage("");
    }

    static void printErrorMessage (int... numbers) {
        if (numbers == null) {
            Console.printMessage("Массив равен null\n");
            return;
        }
        if (numbers.length == 0) {
            Console.printMessage("Массив нулевой длины\n");
        }
    }
}