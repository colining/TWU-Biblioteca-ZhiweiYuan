package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    private BookList bookList;
    private String expectedList;


    @Test
    public void testShowBooks() {
        assertEquals(expectedList,bookList.toString());
    }

    @Before
    public void setUp()  {
        bookList = new BookList();
        bookList.init();
        expectedList = String.format("%-15s %-15s %-30s %n", "Test-driven Development: By Example", "Kent Beck", 2003);
    }
}
