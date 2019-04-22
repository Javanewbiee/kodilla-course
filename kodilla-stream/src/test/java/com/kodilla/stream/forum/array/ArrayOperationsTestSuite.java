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
        int[]list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        OptionalDouble average = getAverage(list);
        //Then
        OptionalDouble expected = OptionalDouble.of(10.5);
        Assert.assertEquals(expected, average);
    }
}
