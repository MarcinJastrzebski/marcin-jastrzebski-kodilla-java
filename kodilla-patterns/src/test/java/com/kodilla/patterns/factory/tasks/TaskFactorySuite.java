package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactorySuite {
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask= factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Zakupy w żabce",shoppingTask.getTaskName());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask= factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Malowanie pokoju",paintingTask.getTaskName());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask= factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Drive to mc'donalds",drivingTask.getTaskName());
    }
}
