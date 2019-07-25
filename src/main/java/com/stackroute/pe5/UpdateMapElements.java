package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class UpdateMapElements {
    public String replaceElement(Map<String, String> map) {
        //checks for null input
        if (map == null) {
            return null;
        }
        //find the value of keys
        String value = map.get("var1");
        String value2 = map.get("var2");
        //replacing the map elements
        map.replace("var1", value, " ");
        map.replace("var2", value2, value);
        //map.replace("var2",value);
        return map.toString();
    }
}
