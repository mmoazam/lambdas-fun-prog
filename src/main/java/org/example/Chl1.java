package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Chl1 {

    static String[] emails = new String[]{"simon.morgan@northcoders.com",
            "chris.ward@northcoders.com",
            "info@stackoverflow.com",
            "hannah.montana@mileycyrus.com"};

    public static void main(String[] args) {


        Arrays.stream(emails).forEach(s -> printIndexOfAtChar.accept(s));
        Stream.of(emails).forEach(s -> printIndexOfAtChar.accept(s));
        // Ch02
        //System.out.println(getEmails.get());
        System.out.println(getEmails1.get());

    } // end main

    static Consumer<String> printIndexOfAtChar = s -> {
        System.out.println(s.indexOf("@"));
    };
    //Ch02 - Return email
    static Supplier<List<String>> getEmails = () ->
            List.of(
                    "simon.morgan@northcoders.com",
                    "chris.ward@northcoders.com",
                    "info@stackoverflow.com",
                    "hannah.montana@mileycyrus");

    static Supplier<String> getEmails1 = () -> {
        String str = "" ;
        for (String s : emails) {
            str =s ;
        } return str;
    };


}
