package me.koxrel.designpatterns.template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Template pattern runs correctly")
class TemplatePatternTest {
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;
    private static ByteArrayOutputStream outContent;
    private static ByteArrayOutputStream errContent;
    private static InputStream originalIn = System.in;

    @AfterAll
    static void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    void setIn(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    @DisplayName("Should add character if user responds with y")
    void runWithPositiveAnswer() {
        try {
            setIn("y");
            TemplatePattern templatePattern = new TemplatePattern();
            templatePattern.run();
        } finally {
            System.setIn(originalIn);
        }

        assertEquals("""
                Loading Game Assets!
                Endless Runner initializing...
                Endless Runner starting...
                Would you like to add a new character to the game? (y/n) Adding new character to the game...
                Endless Runner ending...
                =====
                Loading Game Assets!
                Football Game initializing...
                Football Game starting...
                Football Game ending...
                """, outContent.toString());

    }

    @Test
    @DisplayName("Should not add character if user responds with n")
    void runWithNegativeAnswer() {
        try {
            setIn("n");
            TemplatePattern templatePattern = new TemplatePattern();
            templatePattern.run();
        } finally {
            System.setIn(originalIn);
        }

        assertEquals("""
                Loading Game Assets!
                Endless Runner initializing...
                Endless Runner starting...
                Would you like to add a new character to the game? (y/n) Endless Runner ending...
                =====
                Loading Game Assets!
                Football Game initializing...
                Football Game starting...
                Football Game ending...
                """, outContent.toString());

    }
}