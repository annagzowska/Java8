package com.annagzowska.uppercase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ToUpperCaseJava7 {

    public static List<String> transform(List<String> collection) {
        // List<String> result = withFor(collection);
        // List<String> result = withIterator(collection);
        List<String> result = withForEach(collection);
        return result;
    }

    private static List<String> withForEach(List<String> collection) {
        List<String> result = new ArrayList<>(collection.size());
        for(String element : collection) {
            System.out.println("Element -> " + element);
            if(element != null) {
                result.add(element.toUpperCase());
            }
        }
        return result;
    }

    private static List<String> withIterator(List<String> collection) {
        List<String> result = new ArrayList<>(collection.size());
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value != null) {
                result.add(value.toUpperCase());
            }
        }
        return result;
    }

    private static List<String> withFor(List<String> collection) {
        List<String> result = new ArrayList<>(collection.size());

        // 1. for
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) != null) {
                String element = collection.get(i).toUpperCase();
                result.add(element);
            }
        }
        return result;
    }
}
