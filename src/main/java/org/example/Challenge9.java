package org.example;

import java.util.function.Predicate;

public class Challenge9 {
    static Predicate<String> isEmailValid = s -> s.endsWith("@northcoders.co.uk");
    static Predicate<String> isUsernameHasFiveOrMoreCharacters = s -> s.substring(0, s.indexOf("@")).length() >= 5;

    public static void main(String[] args) {
        /*
        * We're going to create a method to check whether an email address being used to sign up
        *  for an internal system is valid. They have to be from a certain domain and the username has to have a certain length.
        * In this challenge you are to create two predicates:
        * one checking whether an email address is from "@northcoders.co.uk"
        * one checking whether the username of the email address has 5 or more characters
        * If both of these checks pass, print a message to the console to the effect of:
        * Email domain and user valid, please continue
        * If not, print:
        * Email domain and user name invalid, please check your input*/

        String email = "jackson@northcoders.co.uk";
        isEmailAddressValid(email);
    }

//    static void isEmailAddressValid(String email) {
//        Predicate<String> isEmailValid = s -> s.endsWith("@northcoders.co.uk");
//        Predicate<String> isUsernameHasFiveOrMoreCharacters = s -> s.substring(0, s.indexOf("@")).length() >= 5;
//
//        if(isEmailValid.test(email) && isUsernameHasFiveOrMoreCharacters.test(email)){
//            System.out.printf("%s domain and user valid, please continue", email);
//        } else {
//            System.out.printf("%s domain or user name invalid, please check your input", email);
//        }
//    }

    static void isEmailAddressValid(String email) {

        if(isEmailValid.and(isUsernameHasFiveOrMoreCharacters).test(email)){
            System.out.printf("%s domain and user valid, please continue", email);
        } else {
            System.out.printf("%s domain or user name invalid, please check your input", email);
        }
    }

    static String getUserNameFromEmail(String email){
        return email.substring(0, email.indexOf("@"));
    }
}
