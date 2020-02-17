package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[10];
        for (int i =0; i<10; i++){
            numbers[i]=(i+1)*3;
        }

        //When
        double returnedAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(16.5,returnedAverage,0.0001);
    }
}
