package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetElements {
    public String sortingElement(String string) {
        //checks whether input is null
        if (string.length() == 0) {
            return null;
        }
        //split the input string
        String[] inputString = string.split(" ");
        //adding the array elements to ArrayList
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(inputString));

        return new ArrayList<String>(sortedSet).toString();
    }
}
