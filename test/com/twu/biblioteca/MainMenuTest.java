package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {
    private MainMenu mainMenu;
    private String expectedMenu;
    private String expectedInvalidOption;
    private PrintStream printStream;

    @Test
    public void testShowMenu() {
        mainMenu = new MainMenu(System.out);
        assertEquals(expectedMenu, mainMenu.toString());
    }

    @Test
    public void testInvalidOption() {
        printStream = mock(PrintStream.class);
        MainMenu mainMenu2 = new MainMenu(printStream);
        mainMenu2.choose(2);
        verify(printStream).print(expectedInvalidOption);
    }

    @Before
    public void setUp() {
        expectedMenu = "1. List Books";
        expectedInvalidOption = "Select a valid option!";
    }
}
