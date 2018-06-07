package com.annagzowska.uppercase;

import java.util.List;
import java.util.stream.Collectors;


public class ToUpperCaseJava8 {

    public static List<String> transform(List<String> collection) {
        return collection
                .stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }
}
