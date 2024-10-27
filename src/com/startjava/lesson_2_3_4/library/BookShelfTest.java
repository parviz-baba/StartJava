package com.startjava.lesson_2_3_4.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {
    private static final int MIN_CHOICE_NUMBER = 0;
    private static final int MAX_CHOICE_NUMBER = 5;

    public static void main() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        welcome();
        while (true) {
            showMenu();
            if (bookShelf.getBookCount() == 0) {
                System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
            }
            int choice;
            do {
                System.out.print("Введите ваш выбор (0-5): ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1 -> createBook(scanner, bookShelf);
                        case 2 -> showAllBooks(bookShelf.remove(scanner, bookShelf));
                        case 3 -> searchBook(scanner, bookShelf);
                        case 4 -> showAllBooks(bookShelf);
                        case 5 -> showAllBooks(bookShelf.clearShelf(bookShelf));
                        case 0 -> {
                            return;
                        }
                        default -> System.out.print("\nОшибка: введите номер из списка: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nОшибка: введите целое число от 0 до 5");
                    scanner.nextLine();
                    choice = -1;
                }
            } while (choice < MIN_CHOICE_NUMBER || choice > MAX_CHOICE_NUMBER);
        }
    }

    private static void welcome() throws InterruptedException {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                                               ║");
        System.out.println("║                 КНИЖНЫЙ ШКАФ                  ║");
        System.out.println("║                                               ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        String text = "\"*✧･ﾟ:* ДОБРО ПОЖАЛОВАТЬ НА КНИЖНУЮ ШКАФ *:･ﾟ✧*\"\n";
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100);
        }
    }

    private static void showMenu() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                     Меню                      ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   1   ║ Добавить новую книгу                  ║");
        System.out.println("║   2   ║ Удалить книгу                         ║");
        System.out.println("║   3   ║ Найти книгу                           ║");
        System.out.println("║   4   ║ Показать все книги                    ║");
        System.out.println("║   5   ║ Очистить шкаф                         ║");
        System.out.println("║   0   ║ Выйти                                 ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    private static void createBook(Scanner scanner, BookShelf bookShelf) {
        System.out.print("\nВведите имя автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        bookShelf.add(new Book(author, title, year));
        showAllBooks(bookShelf);
    }

    public static void showAllBooks(BookShelf bookShelf) {
        System.out.println("В шкафу книг - " + bookShelf.getBookCount() +
                ", свободно полок - " + bookShelf.getFreeShelves());
        if (bookShelf.getBookCount() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("Книги в шкафу:");
            System.out.println("-----------------------------------------------------");
            System.out.printf("| %-15s | %-10s | %-4s |", "Автор", "Название", "Год");
            System.out.println("\n═════════════════════════════════════════════════════");
            for (int i = 0; i < bookShelf.getBookCount(); i++) {
                Book book = bookShelf.books[i];
                System.out.println(book.toString());
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    private static void searchBook(Scanner scanner, BookShelf bookShelf) {
        if (bookShelf.getBookCount() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.print("\nВведите название книги для поиска: ");
            String searchTitle = scanner.nextLine();
            Book foundBook = bookShelf.find(searchTitle);
            if (foundBook == null) {
                System.out.println("Книга не найдена.");
            } else {
                System.out.println("Книга найдена:");
                System.out.println("------------------------------------------------------");
                System.out.printf("| %-15s | %-10s | %-4s |", "Автор", "Название", "Год");
                System.out.println("\n══════════════════════════════════════════════════════");
                System.out.println(foundBook);
                System.out.println("------------------------------------------------------\n");
            }
        }
    }
}