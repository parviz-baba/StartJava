package com.startjava.lesson_2_3_4.library;

import java.util.Arrays;

public class BookShelf {
    private static final int TOTAL_SHELVES = 2;
    private Book[] books;
    private int count;
    private int maxLength;

    public BookShelf() {
        books = new Book[TOTAL_SHELVES];
    }

    public int getMaxLength() {
        return maxLength;
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
        if (count >= TOTAL_SHELVES) {
            throw new ShelfFullException("Шкаф полон, невозможно добавить новую книгу.");
        }
        books[count] = book;
        count++;
        calculateMaxLength(maxLength, book);
        System.out.println("Книга добавлена: " + book.getTitle() + " ✓");
    }

    public void remove(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга удалена: " + books[i].getTitle());
                int removedBookLength = books[i].toString().length();
                if (i < count - 1) {
                    System.arraycopy(books, i + 1, books, i, count - i - 1);
                }
                books[count - 1] = null;
                count--;
                if (removedBookLength == maxLength) {
                    updateLength();
                }
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
        Arrays.fill(books, 0, count, null);
        count = 0;
        maxLength = 0;
        System.out.println("Шкаф очищен.");
    }

    private void updateLength() {
        maxLength = 0;
        for (Book book : getBooks()) {
            calculateMaxLength(maxLength, book);
        }
    }

    private int calculateMaxLength(int maxLength, Object book) {
        return Math.max(maxLength, book.toString().length());
    }
}