package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookList {
    private Map<String, Book> bookList;
    private Map<String, Book> checkoutList;
    BookList() {
        bookList = new HashMap<>();
        checkoutList = new HashMap<>();
    }


    void init() {
        bookList.put("Test-driven Development: By Example", new Book("Test-driven Development: By Example", "Kent Beck", 2003));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : bookList.entrySet()) {
            sb.append(entry.getValue().getDetails());
        }
        return sb.toString();
    }
}
