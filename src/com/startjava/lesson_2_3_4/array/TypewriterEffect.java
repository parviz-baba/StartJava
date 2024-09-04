package com.startjava.lesson_2_3_4.array;

public class TypewriterEffect {
    public static void main(String[] args) throws InterruptedException {
        String[] inputs = {
                "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin",
                null,
                ""
        };
        for (String input : inputs) {
            if (input != null && !input.isEmpty()) {
                processString(input);
            } else {
                System.out.println("Пустая или нулевая строка");
            }
        }
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