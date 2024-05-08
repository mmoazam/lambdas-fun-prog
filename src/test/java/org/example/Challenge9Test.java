package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Challenge9.isEmailValid;
import static org.example.Challenge9.isUsernameHasFiveOrMoreCharacters;
import static org.junit.jupiter.api.Assertions.*;

class Challenge9Test {

    @Test
    void isEmailAddressValid() {
        assertTrue(isEmailValid.and(isUsernameHasFiveOrMoreCharacters).test("jackson@northcoders.co.uk"));
        assertFalse(isEmailValid.and(isUsernameHasFiveOrMoreCharacters).test("j@northcoders.co.uk"));
        assertFalse(isEmailValid.and(isUsernameHasFiveOrMoreCharacters).test("jackson@co.uk"));
    }
}