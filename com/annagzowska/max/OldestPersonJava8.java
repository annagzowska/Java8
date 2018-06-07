    package com.annagzowska.max;

import java.util.Comparator;
import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class OldestPersonJava8 {
    public static Person getOldestPerson(List<Person> collection) {
        return collection
                .stream()
                .max(Comparator.comparing(p -> p.getAge()))
                .get();
    }

    public static Person findMin(List<Person> collection) {
        return collection
                .stream()
                .min(Comparator.comparing(p -> p.getAge()))
                .get();
    }
}
