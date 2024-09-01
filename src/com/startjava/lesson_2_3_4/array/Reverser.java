package com.startjava.lesson_2_3_4.array;

public class Reverser {
    public static void main(String[] args) {
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] toReverse) {
        if (toReverse == null || toReverse.length == 0) {
            System.out.println("Массив либо нулевой, либо пустой");
            return;
        }
        displayArray("   До реверса: ", toReverse);
        int len = toReverse.length;
        for (int i = 0; i < len; i++) {
            int temp = toReverse[i];
            toReverse[i] = toReverse[--len];
            toReverse[len] = temp;
        }
        displayArray("После реверса: ", toReverse);
    }

    private static void displayArray(String message, int[] toReverse) {
        System.out.print(message + "[");
        for (int i = 0; i < toReverse.length; i++) {
            System.out.print(toReverse[i]);
            if (i < toReverse.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}