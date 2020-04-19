package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given & When
        Logger.getInstance().log("pierwszy log");
        //Then
        Assert.assertEquals("pierwszy log", Logger.getInstance().getLastLog() );
    }
}
