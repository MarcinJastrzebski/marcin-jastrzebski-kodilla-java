package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("\nTest Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end\n");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        //When
        List<Integer> result = OddNumberExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(emptyList,result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        List<Integer> evenList = new ArrayList<Integer>();
        evenList.add(8);
        evenList.add(10);
        //When
        List<Integer> result = OddNumberExterminator.exterminate(list);
        //Then
        Assert.assertEquals(evenList,result);
    }
}
