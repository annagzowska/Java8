package com.annagzowska.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anna on 10/20/16.
 */
public class FilterJava8 {
    public static List<String> filter(List<String> collection) {
        return collection
                .stream()
                .filter(str -> str.length() < 4)
                .peek(str -> System.out.println(str))
                .collect(Collectors.toList());
    }
}
