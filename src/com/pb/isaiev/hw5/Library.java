package com.pb.isaiev.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 7, "IT", "01/01/2000", "38050123456");
        Reader reader2 = new Reader("Иванов И.И.", 8, "IT", "02/02/2002", "38093123456");
        Reader reader3 = new Reader("Сидоров А.А.", 9, "IT", "03/03/2003", "38067123456");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключение", "Иванов И.И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А.В.", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К.В.", "2010 г.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключение", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключение", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

