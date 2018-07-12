package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookList {
    private List<Book> bookList;

    BookList() {
        bookList = new ArrayList<>();
    }


    void init() {
        bookList.add(new Book("Test-driven Development: By Example", "Kent Beck", 2003));
    }

    @Override
    public String toString() {
        return bookList.stream().map(Book::getDetails).collect(Collectors.joining("\n"));
    }
}
