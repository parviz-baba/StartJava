package com.startjava.lesson_2_3_4.library;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        welcome();
        while (true) {
            showMenu();
            if (bookShelf.getBookCount() == 0) {
                System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
            }
            System.out.print("Введите ваш выбор (0-5): ");
            int choice;
            do {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        Book newBook = createBook(scanner);
                        bookShelf.addBook(newBook);
                        updateShelfStatus(bookShelf);
                        break;
                    case 2:
                        System.out.print("\nВведите название книги для удаления: ");
                        String removeTitle = scanner.nextLine();
                        bookShelf.removeBook(removeTitle);
                        updateShelfStatus(bookShelf);
                        break;
                    case 3:
                        if (bookShelf.getBookCount() == 0) {
                            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу");
                        } else {
                            searchBook(scanner, bookShelf);
                        }
                        break;
                    case 4:
                        updateShelfStatus(bookShelf);
                        break;
                    case 5:
                        bookShelf.clearShelf();
                        updateShelfStatus(bookShelf);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.print("\nОшибка: введите номер из списка: ");
                }
            } while (choice < 1 || choice > 6);
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

    private static Book createBook(Scanner scanner) {
        System.out.print("\nВведите имя автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите год издания: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        return new Book(author, title, year);
    }

    private static void updateShelfStatus(BookShelf bookShelf) {
        System.out.println("\nВ шкафу книг - " + bookShelf.getBookCount() +
                ", свободно полок - " + bookShelf.getFreeShelves());
        bookShelf.showAllBooks();
    }

    private static void searchBook(Scanner scanner, BookShelf bookShelf) {
        System.out.print("\nВведите название книги для поиска: ");
        String searchTitle = scanner.nextLine();
        Book foundBook = bookShelf.findBook(searchTitle);
        if (foundBook == null) {
            System.out.println("Книга не найдена.");
        } else {
            System.out.println("Книга найдена: \n" + foundBook);
        }
    }
}