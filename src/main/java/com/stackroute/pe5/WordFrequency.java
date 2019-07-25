package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public String checkFrequency(String input) {
        //checks for empty input
        if (input == null)
            return null;
        List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String eachWord : stringList) {
            if (map.containsKey(eachWord)) {
                map.replace(eachWord, map.get(eachWord) + 1);
            } else {
                map.put(eachWord, 1);
            }
        }
        return map.toString();
    }

}
