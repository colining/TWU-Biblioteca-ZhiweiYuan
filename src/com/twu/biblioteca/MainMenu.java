package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenu {
    private List<String> menu;
    private PrintStream printStream;

    private final static String INVALID_OPTION;

    static {
        INVALID_OPTION = "Select a valid option!";
    }

    MainMenu(PrintStream printStream) {
        menu = new ArrayList<>();
        menu.add("1. List Books");
        menu.add("2. Quit");
        this.printStream = printStream;
    }

    @Override
    public String toString() {
        return menu.stream().collect(Collectors.joining("\n"));
    }

    void choose(int number) {
        if (number > menu.size()) {
            printStream.print(INVALID_OPTION);
        }
        if (number == 1) {
            printStream.print(new BookList());
        } else if (number == 2) {
            System.exit(0);
        }
    }


}
