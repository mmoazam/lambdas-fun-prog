package org.example;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalJava {

    public static void main(String[] args) {
        System.out.println(squared.apply(4));
        System.out.println(greeting.apply("moazam"));

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(3);
        integers.add(52);
        integers.add(76);

        for (int i : integers) {
            System.out.println(addTen.apply(i));
        }

        integers.forEach(i -> System.out.println(addTen.apply(i)));
        integers.forEach(i -> System.out.println(i));


        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        Predicate<String> isValidEmail = s -> s.contains("@");

        System.out.println(isValidEmail.test("mmma@s"));

    }

    static Function<Integer, Integer> squared = x -> x * x;

    static Function<String, String> greeting = s -> "Hey, there " + s + "!";

    static Function<Integer, Integer> addTen = i -> i + 10;


}