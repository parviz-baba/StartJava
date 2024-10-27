package com.startjava.lesson_2_3_4.library;

import java.util.Scanner;

public class BookShelf {
    Book[] books;
    private int bookCount;
    private static final int TOTAL_SHELVES = 10;

    public BookShelf() {
        books = new Book[TOTAL_SHELVES];
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

    public BookShelf remove(Scanner scanner, BookShelf bookShelf) {
        System.out.print("\nВведите название книги для удаления: ");
        String title = scanner.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга удалена: " + books[i].getTitle());
                if (i < bookCount - 1) {
                    System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                }
                books[bookCount - 1] = null;
                bookCount--;
                return bookShelf;
            }
        }
        System.out.println("Книга не найдена: " + title);
        return bookShelf;
    }

    public Book find(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public BookShelf clearShelf(BookShelf bookShelf) {
        for (int i = 0; i < bookCount; i++) {
            books[i] = null;
        }
        bookCount = 0;
        System.out.println("Шкаф очищен.");
        return bookShelf;
    }
}