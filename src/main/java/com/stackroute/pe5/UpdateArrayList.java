package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArrayList {
    public List<String> replaceElement(String input, int index, String value, int index1, String value2) {
        List<String> list;
        //split the input string
        String[] inputString = input.split(", ");
        //checks for empty input
        if (input.length() == 0) {
            return null;
        }

        list = new ArrayList<>(Arrays.asList(inputString));
        System.out.println(list);
        //replacing the elements
        list.set(index, value);
        list.set(index1, value2);

        return list;
    }
}
