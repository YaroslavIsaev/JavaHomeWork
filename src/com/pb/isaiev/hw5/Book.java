package com.pb.isaiev.hw5;

public class Book {
    String name;
    String author;
    String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInfo() {
        return "Название: '" + name + '\'' + ", Автор: " + author + ", Год: " + year;
    }
}
