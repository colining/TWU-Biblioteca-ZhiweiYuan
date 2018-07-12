package com.twu.biblioteca;

import com.sun.tools.javac.Main;

import java.io.PrintStream;
import java.util.Scanner;

public class BibliotecaApp {
    private PrintStream printStream;
    private Scanner input;
    private Welcome welcome;
    private BookList bookList;
    private MainMenu mainMenu;

    public BibliotecaApp(PrintStream printStream, Scanner input, Welcome welcome, BookList bookList, MainMenu mainMenu) {
        this.printStream = printStream;
        this.input = input;
        this.welcome = welcome;
        this.bookList = bookList;
        this.mainMenu = mainMenu;
    }

    BibliotecaApp() {
        this.printStream = System.out;
        this.input = new Scanner(System.in);
        this.welcome = new Welcome(this.printStream);
        this.bookList = new BookList();
        this.bookList.init();
        this.mainMenu = new MainMenu(this.printStream);

    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcome.welcome();
        app.printStream.print(app.mainMenu);

    }
}
