package com.annagzowska.flatmap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anna on 10/20/16.
 */
public class FlatMapJava8 {
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(value -> value.stream())
                .collect(Collectors.toList());
    }
}
