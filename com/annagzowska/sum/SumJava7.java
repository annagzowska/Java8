package com.annagzowska.sum;

import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class SumJava7 {
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
