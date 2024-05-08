package org.example;

import java.util.function.BiFunction;

public class Challenge6 {
    static BiFunction<String, Integer, Integer> lengthOfStringPlusInt = (s, n) -> s.length() + n;

    /*
    Write a BiFunction which takes in a string and an integer and returns the total value of the length of the
    string plus the integer.
     */
    public static void main(String[] args) {


        System.out.println(lengthOfStringPlusInt.apply("Hello", 3));
    }

}
