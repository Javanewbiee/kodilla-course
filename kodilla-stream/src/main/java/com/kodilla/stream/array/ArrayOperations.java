package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers){
        IntStream.range(1,numbers.length + 1)
                .forEach(System.out::println);
        OptionalDouble averageDone = IntStream.range(1, numbers.length + 1)
                .average();
        return averageDone;
    }
}
