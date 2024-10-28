package com.startjava.lesson_2_3_4.library;

import java.util.Arrays;

public class BookShelf {
    private static final int TOTAL_SHELVES = 10;
    private Book[] books;
    private int count;

    public BookShelf() {
        books = new Book[TOTAL_SHELVES];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    public int getCount() {
        return count;
    }

    public int getFreeShelves() {
        return TOTAL_SHELVES - count;
    }

    public void add(Book book) {
        if (count < TOTAL_SHELVES) {
            books[count] = book;
            count++;
            System.out.println("Книга добавлена: " + book.getTitle() + " ✓");
        } else {
            System.out.println("Шкаф полон, невозможно добавить новую книгу.");
        }
    }

    public void remove(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга удалена: " + books[i].getTitle());
                if (i < count - 1) {
                    System.arraycopy(books, i + 1, books, i, count - i - 1);
                }
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Книга не найдена: " + title);
    }

    public Book find(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            books[i] = null;
        }
        count = 0;
        System.out.println("Шкаф очищен.");
    }
}