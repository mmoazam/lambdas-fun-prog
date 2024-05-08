package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> listOfPeople = new ArrayList<>();
        Person p1 = new Person();
        p1.age = 10;
        p1.phoneNumber = "123";

        Person p2 = new Person();
        p2.age = 11;
        p2.phoneNumber = "123";

        listOfPeople.add(p1);
        listOfPeople.add(p2);


        ListSumCalculator<Person> calc = new ListSumCalculator<>(listOfPeople);
        System.out.println(listOfPeople);
        int sum = calc.sumBy(p -> p.age);
        System.out.println(sum);

        sum = calc.sumBy(p -> Integer.parseInt(p.phoneNumber));
        System.out.println(sum);

        sum = calc.sumBy(p -> Integer.parseInt(p.phoneNumber) + p.age);
        System.out.println(sum);

    }
}
