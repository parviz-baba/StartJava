package com.startjava.lesson_2_3_4.array;

public class Reverser {
    public static void main(String[] args) {
        toReverse(new int[0]);
        toReverse(null);
        toReverse(new int[]{6, 8, 9, 1});
        toReverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void toReverse(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив либо нулевой, либо пустой");
            return;
        }
        displayArray("   До реверса: ", array);
        int len = array.length;
        for (int i = 0; i < --len; i++) {
            int temp = array[i];
            array[i] = array[len];
            array[len] = temp;
        }
        displayArray("После реверса: ", array);
    }

    private static void displayArray(String message, int[] array) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}