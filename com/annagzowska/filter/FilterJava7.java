package com.annagzowska.filter;

import java.util.ArrayList;
import java.util.List;


public class FilterJava7 {

    public static List<String> filter(List<String> collection) {
        List<String> result = new ArrayList<>(collection.size());
        for(String element : collection) {
            if(element.length() < 4) {
                result.add(element);
            }
        }
        return result;
    }
}
