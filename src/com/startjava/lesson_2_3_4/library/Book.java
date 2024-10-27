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

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}