package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    static String[] emails = new String[]{"simon.morgan@northcoders.com",
            "chris.ward@northcoders.com",
            "info@stackoverflow.com",
            "hannah.montana@mileycyrus.com"};

    public static void main(String[] args) {
        C3 c3 = new C3();
        c3.getSixthCharAndAddExcl.accept("qwerty");
        System.out.println();
        //Ch04
        C4 c4 = new C4();
        Stream.of(emails).forEach(s -> c4.userNameFromEmail.accept(s));
        //c4.userNameFromEmail.accept("chris.ward@northcoders.com");

    }
}
