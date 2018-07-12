package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private String title;
    private String author;
    private int yearPublished;
    private Book book;


    @Before
    public void setUp() {
        title = "Test-driven Development: By Example";
        author = "Kent Beck";
        yearPublished = 2003;
        book = new Book(title, author, yearPublished);
    }

}