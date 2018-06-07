package com.annagzowska.filterandmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class FilterAndMapJava7 {
    public static List<String> transform(List<Person> people) {
        List<String> result = new ArrayList<>();
        for (Person person : people) {
            if(person.getAge() >= 16 && person.getAge() < 18) {
                result.add(person.getName());
            }
        }
        return result;
    }
}
