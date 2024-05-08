package org.example;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class Challenge8 {
    static         BiPredicate<String, Integer> lengthOfWordIsLongerThanInteger = (s, i) -> s.length() > i;

    public static void main(String[] args) {
        /*
        * Write a BiPredicate which takes in two parameters, a string and an integer.
        *  It should perform a check on whether the length of the word is longer than the integer value.

        Apply this to each of the values of the word ArrayList from before and print the result to the console.*/

//        System.out.println(lengthOfWordIsLongerThanInteger.test("asd", 2));
//        System.out.println(lengthOfWordIsLongerThanInteger.test("asd", 1));
//        System.out.println(lengthOfWordIsLongerThanInteger.test("asd", 3));
//        System.out.println(lengthOfWordIsLongerThanInteger.test("asd", 4));

        ArrayList<String> words = new ArrayList<>();
        words.add("Amazing!");
        words.add("apple!");
        words.add("Awesome!");
        words.add("Artichoke");

        words.forEach( (s) -> System.out.println(lengthOfWordIsLongerThanInteger.test(s, 7)));
    }
}
