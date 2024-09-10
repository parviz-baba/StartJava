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
}