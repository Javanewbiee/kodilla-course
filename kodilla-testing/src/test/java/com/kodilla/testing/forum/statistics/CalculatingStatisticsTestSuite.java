package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatingStatisticsTestSuite {

    private static int counter = 0;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Starting test");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Test ended");
    }
    @Before
    public void before(){
        counter++;
        System.out.println("Test number " + counter);
    }
    @Test
    public void testCalculateAdvStatisticsUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics(statisticsMock);
        List<String>usersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When

    }

}
