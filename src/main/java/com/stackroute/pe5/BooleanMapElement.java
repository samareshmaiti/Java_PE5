package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BooleanMapElement {
    public Map checkBoolean(String[] inputString) {
        //checks whether input is null
        if (inputString.length == 0) {
            return null;
        }
        Map map = new HashMap<>();
        int count[] = {0, 0, 0, 0};
        //checking for occurance of the element
        for (int i = 0; i < inputString.length; i++) {
            switch (inputString[i]) {
                case "a":
                    count[0]++;
                    break;
                case "b":
                    count[1]++;
                    break;
                case "c":
                    count[2]++;
                    break;
                case "d":
                    count[3]++;
                    break;
            }
        }
        //putting the elements to map and check whether their occurance is more than 2 times or not
        for (int j = 0; j < count.length; j++) {

            if (count[j] >= 2) {
                boolean flag1 = true;
                map.put(inputString[j], flag1);
            } else {
                boolean flag1 = false;
                map.put(inputString[j], flag1);
            }
        }
        System.out.println(map);

        return map;
    }
}
