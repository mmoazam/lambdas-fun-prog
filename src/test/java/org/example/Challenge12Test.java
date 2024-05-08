package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Challenge12Test {



    @Test
    void classTakesList(){
        List<String> listToFilter = new ArrayList<>();
        listToFilter.add("pop");
        listToFilter.add("Apop");

        ListFilter listFilter = new ListFilter(listToFilter);

        List<String> filteredList = listFilter.filter(s -> s.startsWith("A"));

        assertEquals(1, filteredList.size());
    }
}