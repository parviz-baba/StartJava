package com.startjava.lesson_2_3_4.library;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int bookCount;
    private static final int TOTAL_SHELVES = 10;

    public BookShelf() {
        books = new Book[TOTAL_SHELVES];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, getBookCount());
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return TOTAL_SHELVES - bookCount;
    }

    public void add(Book book) {
        if (bookCount < TOTAL_SHELVES) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Книга добавлена: " + book.getTitle() + " ✓");
        } else {
            System.out.println("Шкаф полон, невозможно добавить новую книгу.");
        }
    }

    public void remove(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга удалена: " + books[i].getTitle());
                if (i < bookCount - 1) {
                    System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                }
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
        System.out.println("Книга не найдена: " + title);
    }

    public Book find(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < bookCount; i++) {
            books[i] = null;
        }
        bookCount = 0;
        System.out.println("Шкаф очищен.");
    }
}