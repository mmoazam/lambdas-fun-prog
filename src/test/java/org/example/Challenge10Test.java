package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Challenge10.endsWithG;
import static org.junit.jupiter.api.Assertions.*;

class Challenge10Test {

    @Test
    void endsWithGMessage() {
        assertTrue(endsWithG.test("flying"));
        assertFalse(endsWithG.test("fly"));
        assertEquals("Hi!", Challenge10.addExclamation.apply("Hi"));
    }
}