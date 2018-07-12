package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenu {
    private List<String> menu;

    MainMenu() {
        menu = new ArrayList<>();
        menu.add("1. List Books");
    }

    @Override
    public String toString() {
        return menu.stream().collect(Collectors.joining("\n"));
    }
}
