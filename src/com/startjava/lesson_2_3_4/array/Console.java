package com.startjava.lesson_2_3_4.array;

import java.util.Random;

import static com.startjava.lesson_2_3_4.array.Arrays.calculateFactorial;
import static com.startjava.lesson_2_3_4.array.Arrays.formatResult;

public class Console {
    static void printArray(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            System.out.printf("%.3f ", randomFloats[i]);
            if (i + 1 == 8) {
                System.out.println();
            }
        }
        System.out.println();
    }

    static void printFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Массив нулевой длины");
            return;
        }
        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен.");
            } else {
                results[i] = calculateFactorial(number);
                System.out.println(formatResult(number, results[i]));
            }
        }
        System.out.println("Массив результатов: ");
        for (long result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
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

    static void displayArray(String message, int[] toReverse) {
        System.out.print(message + "[");
        for (int i = 0; i < toReverse.length; i++) {
            System.out.print(toReverse[i]);
            if (i < toReverse.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static void printTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правая граница (%d)\n", (int) start, (int) end);
            return;
        }
        char[] symbols = new char[end - start + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = ascending ? (char) (start + i) : (char) (end - i);
        }
        int maxSymbols = symbols.length * 2 - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            int numChars = 2 * i + 1;
            int spaces = (maxSymbols - numChars) / 2;
            sb.append(" ".repeat(spaces)).append(String.valueOf(symbols[i]).repeat(numChars)).append(("\n"));
        }
        System.out.print(sb);
    }

    static void processString(String input) throws InterruptedException {
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