package org.example;

import java.util.function.BiFunction;

public class Challenge7 {
    /*
    Write a function which takes in two string arguments and returns an integer total of the index of the
    letter "a" in the first argument added to the index of the letter "e" in the second.

    Example: Passing in the words "start" and "pale" should return 5.
     */

    static BiFunction<String, String, Integer> indexOfAAddedToIndexOfE = (s1 , s2) -> s1.indexOf('a') + s2.indexOf('e');

    public static void main(String[] args) {

        System.out.println(indexOfAAddedToIndexOfE.apply("start", "pale"));
    }
}
