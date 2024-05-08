package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge8Test {

    @Test
    void lengthOfWordIsLongerThanIntegerTest(){
     assertTrue(Challenge8.lengthOfWordIsLongerThanInteger.test("Hello", 2));
        assertFalse(Challenge8.lengthOfWordIsLongerThanInteger.test("Hello", 10));
    }

}