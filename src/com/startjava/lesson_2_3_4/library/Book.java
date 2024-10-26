package com.startjava.lesson_2_3_4.library;

public class Book {
    private String author;
    private String title;
    private int publishYear;

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
        return "Book{" +
                "Автор='" + author + '\'' +
                ", Название='" + title + '\'' +
                ", Год=" + publishYear +
                '}';
    }
}