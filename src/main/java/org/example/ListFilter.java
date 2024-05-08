package org.example;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListFilter {
 List<String> listToFilter;

 /*
 *  This class should have a filter method that takes a lambda expression as a parameter.
 *  This method should apply the lambda filter to the list and return
 *  a list that matches the filter criteria.*/

   // Contructor.
    public ListFilter(List<String> listToFilter) {
        this.listToFilter = listToFilter;
    }


    public List<String> filter(Predicate<String> predicate){

        return listToFilter.stream()
                .filter(predicate)
                .toList();
    }
}
