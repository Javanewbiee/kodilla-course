package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers){
        Arrays.stream(numbers).forEach(System.out::println);
        //IntStream.rangeClosed(0,numbers.length)
                //.map(n -> numbers[n])
                //.forEach(System.out::println);
        OptionalDouble averageDone = Arrays.stream(numbers).average();
        return averageDone;
    }
}
