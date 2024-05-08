package org.example;

import java.util.List;

public class ListSumCalculator<T> {

    /*
    Next, create a ListSumCalculator<T> class.
    The constructor for this class should take a List<T> and store it as a list. For example, it should be possible to pass a list of
    Person to the constructor and the ListSumCalculator will have a list of Person objects.
    The ListSumCalculator should have a method called sumBy which takes a lambda expression. This lambda expression describes how to
    transform the <T> object into an integer. The method returns the sum of all of these integers.
     */ List<T> list;

    public ListSumCalculator(List<T> list) {
        this.list = list;
    }


    public int sumBy(IntConverter<T> converter) {

        int sum = 0;
        for (T item : list) {
            sum += converter.convert(item);
        }
        return sum;
    }
}
