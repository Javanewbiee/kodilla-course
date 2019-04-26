package com.kodilla.stream.forum.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite{

    @Test
    public void testGetAverage(){
        //Given
        int []list = {1,22,23,4,25,6,27,28,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        OptionalDouble average = getAverage(list);
        //Then
        OptionalDouble expected = OptionalDouble.of(15.5);
        Assert.assertEquals(expected, average);
    }
}
