package com.annagzowska.flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class FlatMapJava7 {
    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
}
