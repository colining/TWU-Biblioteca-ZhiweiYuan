package com.twu.biblioteca;

import java.io.PrintStream;

class Welcome {
    private PrintStream printStream;
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca";
    Welcome(PrintStream printStream) {
        this.printStream = printStream;
    }

    void welcome() {
        printStream.println(WELCOME_MESSAGE);
    }
}
