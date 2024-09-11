package com.startjava.lesson_2_3_4.array;

public class Console {
    public static void printMessage(String message) {
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

    public static void printResult(int number, long result) {
        printMessage(formatResult(number, result));
    }

    public static void printResultsArray(long[] results) {
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
}