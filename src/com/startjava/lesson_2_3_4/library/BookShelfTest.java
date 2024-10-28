package com.startjava.lesson_2_3_4.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {
    private static final int MIN_CHOICE_NUMBER = 0;
    private static final int MAX_CHOICE_NUMBER = 5;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        welcome();
        while (true) {
            showMenu();
            if (bookShelf.getCount() == 0) {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            }
            int choice;
            do {
                System.out.print("Введите ваш выбор (0-5): ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    selectAction(choice, scanner, bookShelf);
                } catch (InputMismatchException e) {
                    System.out.println("\nОшибка: введите целое число от 0 до 5");
                    scanner.nextLine();
                    choice = -1;
                }
                if (choice == 0) return;
            } while (choice < MIN_CHOICE_NUMBER || choice > MAX_CHOICE_NUMBER);
        }
    }

    private static void welcome() throws InterruptedException {
        System.out.print("""
                ╔═══════════════════════════════════════════════╗
                ║                                               ║
                ║                 КНИЖНЫЙ ШКАФ                  ║
                ║                                               ║
                ╚═══════════════════════════════════════════════╝
                """);
        String text = "\"*✧･ﾟ:* ДОБРО ПОЖАЛОВАТЬ В КНИЖНЫЙ ШКАФ *:･ﾟ✧*\"\n";
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100);
        }
    }

    private static void showMenu() {
        System.out.println("""
                \n╔═══════════════════════════════════════════════╗
                ║                     Меню                      ║
                ╚═══════════════════════════════════════════════╝
                ╔═══════════════════════════════════════════════╗
                ║   1   ║ Добавить новую книгу                  ║
                ║   2   ║ Удалить книгу                         ║
                ║   3   ║ Найти книгу                           ║
                ║   4   ║ Показать все книги                    ║
                ║   5   ║ Очистить шкаф                         ║
                ║   0   ║ Выйти                                 ║
                ╚═══════════════════════════════════════════════╝
                """);
    }

    private static void selectAction(int choice, Scanner scanner, BookShelf bookShelf) {
        switch (choice) {
            case 1 -> addBook(scanner, bookShelf);
            case 2 -> removeBook(scanner, bookShelf);
            case 3 -> searchBook(scanner, bookShelf);
            case 4 -> showAllBooks(bookShelf);
            case 5 -> clearShelf(bookShelf);
            case 0 -> {
            }
            default -> System.out.print("\nОшибка: введите номер из списка: ");
        }
    }

    private static void addBook(Scanner scanner, BookShelf bookShelf) {
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

    private static void showAllBooks(BookShelf bookShelf) {
        System.out.println("\nВ шкафу книг - " + bookShelf.getCount() +
                           ", свободно полок - " + bookShelf.getFreeShelves());
        if (bookShelf.getCount() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println();
            System.out.println("|-----------------------------------------------|");
            for (Book book : bookShelf.getBooks()) {
                System.out.printf("| %-45s |\n", book.toString());
                System.out.println("|-----------------------------------------------|");
            }
        }
    }

    private static void removeBook(Scanner scanner, BookShelf bookShelf) {
        System.out.print("\nВведите название книги для удаления: ");
        String title = scanner.nextLine();
        bookShelf.remove(title);
        showAllBooks(bookShelf);
    }

    private static void searchBook(Scanner scanner, BookShelf bookShelf) {
        if (bookShelf.getCount() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.print("\nВведите название книги для поиска: ");
            String searchTitle = scanner.nextLine();
            Book foundBook = bookShelf.find(searchTitle);
            if (foundBook == null) {
                System.out.println("Книга не найдена.");
            } else {
                System.out.println("Книга найдена:");
                System.out.println("|-----------------------------------------------|");
                System.out.printf("| %-45s |\n", foundBook);
                System.out.println("|-----------------------------------------------|\n");
            }
        }
    }

    private static void clearShelf(BookShelf bookShelf) {
        bookShelf.clear();
        showAllBooks(bookShelf);
    }
}