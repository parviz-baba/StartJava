package com.startjava.lesson_2_3_4.library;

public class Book {
    private final String author;
    private final String title;
    private final int publishYear;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.publishYear = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-10s | %-4s |", getAuthor(), getTitle(), getPublishYear());
    }
}