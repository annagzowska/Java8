package com.annagzowska.sum;

import java.util.List;

/**
 * Created by anna on 10/20/16.
 */
public class SumJava8 {
    public static int sum(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (suma, nastepny) -> suma + nastepny);
    }
}
