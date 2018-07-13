package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    private String expectedWelcomeMessage;
    private BibliotecaApp app;

    @Before
    public void setUp() {
        expectedWelcomeMessage = "Welcome to Biblioteca";
        app = new BibliotecaApp();
    }

}