package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainMenuTest {
    private MainMenu mainMenu;
    private String expectedMenu;


    @Test
    public void testShowMenu() {
        assertEquals(expectedMenu, mainMenu.toString());
    }

    @Before
    public void setUp() {
        mainMenu = new MainMenu();
        expectedMenu = "1. List Books";
    }
}
