package com.kodilla.testing.colletion;

import java.util.*;
import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.*;

public class CollectionTestSuite {

    @Test
    public void testOddNumberExterminatorEmptyList(){
        //given
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        //when
        OddNumberExterminator emptyList = new OddNumberExterminator();
        ArrayList<Integer>checked = emptyList.exterminate(numbers);
        //assert
        Assert.assertTrue(checked.size() ==0);
    }
    @Test
    public void testOddNumberExterminatorNormalList() {
        //given
        ArrayList<Integer>numbers = new ArrayList<Integer>();
            numbers.add(10);
            numbers.add(12);
            numbers.add(13);
            numbers.add(14);
            numbers.add(15);
            numbers.add(16);
        //when
        OddNumberExterminator normalList = new OddNumberExterminator();
        ArrayList<Integer>checked = normalList.exterminate(numbers);
        //assert
        for (Integer a: checked) {
            Assert.assertTrue(a%2 == 0);
        }
    }
    @Before
    public void before() {
        System.out.println("Testing empty list");
    }
    @After
    public void after(){
        System.out.println("Test completed");
    }
}
