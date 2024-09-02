package com.startjava.lesson_2_3_4.array;

import java.util.*;

public class NumberRange {
    public static void main(String[] args) {
        generateNumbers(-10, 20, 23);
        generateNumbers(-34, 0, -10);
        generateNumbers(1, 2, 3);
        generateNumbers(5, -8, 2);
    }

    private static void generateNumbers (int... numbers) {
        int max = Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
        int min = Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
        int rangeLength = max - min + 1;
        int arrayLength = (int) (rangeLength * 0.75);
        if (arrayLength < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" + arrayLength + ")");
            return;
        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        while (uniqueNumbers.size() < arrayLength) {
            uniqueNumbers.add(random.nextInt(min, max + 1));
        }
        List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }
}