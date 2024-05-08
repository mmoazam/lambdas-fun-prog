package org.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class Challenge10 {
    /*
    We'll create a method which takes in a string. Within this we'll have a conditional check.
    Create a predicate function to check whether a string ends with 'g'.
    If the predicate returns true, then we'll apply a function that adds an exclamation mark to the end '!',
    converts the word to uppercase and prints it to the console.
    Else, print the word with a message " does not end with 'g'" to the console.
     */

    static Predicate<String> endsWithG = s -> s.endsWith("g");
    static Function<String, String> addExclamation = s -> s + "!";

    public static void main(String[] args) {
        endsWithGMessage("ending");
        endsWithGMessage("start");
    }

    public static void endsWithGMessage(String input){
        if (endsWithG.test(input)) {
            System.out.println(addExclamation.apply(input.toUpperCase()));
        } else {
            System.out.printf("'%s' does not end with 'g'", input);
        }
    }
}
