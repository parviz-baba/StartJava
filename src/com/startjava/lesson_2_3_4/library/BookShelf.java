package com.startjava.lesson_2_3_4.library;

import java.util.Arrays;

public class BookShelf {
    private static final int TOTAL_SHELVES = 2;
    private Book[] books;
    private int count = 0;
    private static int maxLength;

    public BookShelf() {
        books = new Book[TOTAL_SHELVES];
    }

    public int getMaxLength() {
        return maxLength;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    private void updateLength() {
        maxLength = 0;
        for (Book book : getBooks()) {
            maxLength = Math.max(maxLength, book.toString().length());
        }
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
            updateLength();
            System.out.println("Книга добавлена: " + book.getTitle() + " ✓");
        } else {
            throw new ShelfFullException("Шкаф полон, невозможно добавить новую книгу.");
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
                updateLength();
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
}