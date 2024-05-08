package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Challenge5 {

    static Predicate<String> beginsWithAEndsWithExclamation = s -> s.startsWith("A") && s.endsWith("!");

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Amazing!");
        words.add("apple!");
        words.add("Awesome!");
        words.add("Artichoke");

        //        System.out.println(beginsWithAEndsWithExclamation.test("apples"));
        //        System.out.println(beginsWithAEndsWithExclamation.test("Apples"));
        //        System.out.println(beginsWithAEndsWithExclamation.test("apples!"));
        //        System.out.println(beginsWithAEndsWithExclamation.test("Apples!"));

        words.forEach(s -> System.out.println(beginsWithAEndsWithExclamation.test(s)));

    }
}
