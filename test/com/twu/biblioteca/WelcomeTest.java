package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeTest {

    @Test
    public void testWelcomeMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Welcome welcome = new Welcome(printStream);
        welcome.welcome();
        verify(printStream).println("Welcome to Biblioteca");
    }
}
