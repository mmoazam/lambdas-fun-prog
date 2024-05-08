package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalJavaTest {

    @Test
    public void squaredTest() {

        assertEquals( 9, FunctionalJava.squared.apply(3));
        assertEquals( 16, FunctionalJava.squared.apply(4));
        assertEquals( 0, FunctionalJava.squared.apply(0));

    }

    @Test
    public void greetingTest() {

        assertEquals( "Hey, there Jackson!", FunctionalJava.greeting.apply("Jackson"));

    }

    @Test
    public void addTenTest() {

        assertEquals( 20, FunctionalJava.addTen.apply(10));
        assertEquals( 0, FunctionalJava.addTen.apply(-10));
        assertEquals( 10, FunctionalJava.addTen.apply(0));
        assertEquals( 25, FunctionalJava.addTen.apply(15));
    }

}