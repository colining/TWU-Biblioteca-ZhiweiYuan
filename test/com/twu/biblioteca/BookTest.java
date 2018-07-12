package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private String title;
    private String author;
    private int yearPublished;
    private Book book;
    private String expectedDetails;

    @Before
    public void setUp() {
        title = "Test-driven Development: By Example";
        author = "Kent Beck";
        yearPublished = 2003;
        book = new Book(title, author, yearPublished);
        expectedDetails = String.format("%-15s %-15s %-30s %n", title, author, yearPublished);
    }

    @Test
    public void shouldGetBookDetails() {
        assertEquals(expectedDetails, book.getDetails());
    }

}