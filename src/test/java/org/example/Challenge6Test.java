package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge6Test {

    @Test
    void lengthOfStringPlusIntTest(){

        Assertions.assertEquals(5 , Challenge6.lengthOfStringPlusInt.apply("Hey", 2));
        Assertions.assertEquals(2 , Challenge6.lengthOfStringPlusInt.apply("", 2));
        Assertions.assertEquals(5 , Challenge6.lengthOfStringPlusInt.apply("Hello", 0));
    }

}