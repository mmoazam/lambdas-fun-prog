package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge5Test {

    @Test
    void beginsWithAEndsWithExclamationTest() {
        Challenge5 challenge5 = new Challenge5();

        Assertions.assertTrue(Challenge5.beginsWithAEndsWithExclamation.test("A!"));
        Assertions.assertTrue(Challenge5.beginsWithAEndsWithExclamation.test("Abcd!"));
        Assertions.assertFalse(Challenge5.beginsWithAEndsWithExclamation.test("Abcd"));
        Assertions.assertFalse(Challenge5.beginsWithAEndsWithExclamation.test("abce!"));
    }
}