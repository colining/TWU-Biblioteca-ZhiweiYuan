package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        new Welcome(printStream).welcome();
        BookList bookList = new BookList();
        bookList.init();
        printStream.print(bookList);
    }
}
