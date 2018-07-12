package com.twu.biblioteca;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    String getDetails() {
        return String.format("%-15s %-15s %-30s %n", title, author, yearPublished);
    }
}
