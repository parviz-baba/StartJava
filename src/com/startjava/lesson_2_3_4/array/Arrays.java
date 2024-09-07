package com.startjava.lesson_2_3_4.array;

import static com.startjava.lesson_2_3_4.array.Console.displayArray;

import java.util.Random;

public class Arrays {
    static int removeGreaterElements(float[] randomFloats, int address) {
        double threshold = randomFloats[address];
        int zeroedCount = 0;
        for (int i = 0; i < randomFloats.length; i++) {
            if (randomFloats[i] > threshold) {
                randomFloats[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }

    static long calculateFactorial(long number) {
        if (number == 0) return 1;
        long factorial = 1L;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void generateNumbers(int... numbers) {
        int start = numbers[0];
        int end = numbers[1];
        int countPerLine = numbers[2];
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
            return;
        }
        int rangeLength = end - start + 1;
        int arrayLength = (int) (rangeLength * 0.75);
        if (arrayLength < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    arrayLength + ")");
            return;
        }
        if (countPerLine < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 (" +
                    countPerLine + ")");
            return;
        }
        int[] uniqueNumbers = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            int number;
            boolean isUnique;
            do {
                isUnique = true;
                number = random.nextInt(start, end + 1);
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == number) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = number;
        }
        for (int i = 0; i < uniqueNumbers.length - 1; i++) {
            for (int j = i + 1; j < uniqueNumbers.length; j++) {
                if (uniqueNumbers[i] > uniqueNumbers[j]) {
                    int temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.printf("%4d ", uniqueNumbers[i]);
            if ((i + 1) % countPerLine == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static void reverse(int[] toReverse) {
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

    public static void processString(String input) throws InterruptedException {
        String[] parts = input.split("\n");
        String mainText = parts[0];
        String author = parts.length > 1 ? parts[1] : "";
        String[] words = mainText.split("\\s+");
        String shortestWord = null;
        String longestWord = null;
        for (String word : words) {
            String cleanedWord = word.replaceAll("[.,]", "");
            if (cleanedWord.length() > 1) {
                if (shortestWord == null || cleanedWord.length() < shortestWord.length()) {
                    shortestWord = cleanedWord;
                }
                if (longestWord == null || cleanedWord.length() > longestWord.length()) {
                    longestWord = cleanedWord;
                }
            }
        }
        if (shortestWord != null) {
            System.out.println("Самое короткое слово: " + shortestWord.toUpperCase());
            System.out.println("Самое длинное слово: " + longestWord.toUpperCase());
            StringBuilder processedText = new StringBuilder();
            boolean capitalize = false;
            for (String word : words) {
                String cleanedWord = word.replaceAll("[.,]", "");
                if (cleanedWord.equals(shortestWord)) {
                    capitalize = true;
                }
                if (capitalize) {
                    processedText.append(word.toUpperCase()).append(" ");
                } else {
                    processedText.append(word).append(" ");
                }
                if (cleanedWord.equals(longestWord)) {
                    capitalize = false;
                }
            }
            System.out.println();
            for (char c : processedText.toString().toCharArray()) {
                System.out.print(c);
                Thread.sleep(100);
            }
            if (!author.isEmpty()) {
                System.out.println();
                System.out.println(author);
            }
            System.out.println();
        }
    }
}