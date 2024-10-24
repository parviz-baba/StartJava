package com.startjava.lesson_2_3_4.library;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String header = String.format("| %-15s | %-10s | %-4s |", "Автор", "Название", "Год");
        String separator = "══════════════════════════════════════════════════════";
        String bookInfo = String.format("| %-15s | %-10s | %-4d |", author, title, year);
        return header + "\n" + separator + "\n" + bookInfo +
                "\n------------------------------------------------------";
    }
}