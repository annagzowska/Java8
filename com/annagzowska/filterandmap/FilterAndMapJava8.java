package com.annagzowska.filterandmap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anna on 10/20/16.
 */
public class FilterAndMapJava8 {
    public static List<String> transform(List<Person> collection) {
        return collection
                .stream()
                .filter(p -> p.getAge() >= 16)
                .filter(p -> p.getAge() < 18)
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }
}
