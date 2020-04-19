package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testGetToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        Assert.assertEquals("first task", board.getToDoList().tasks.get(0));
    }

    @Test
    public void testGetInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        Assert.assertEquals("first task", board.getInProgressList().tasks.get(0));
    }

    @Test
    public void testGetDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        Assert.assertEquals("first task", board.getDoneList().tasks.get(0));
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().tasks.add("raz");
        board.getInProgressList().tasks.add("dwa");
        board.getDoneList().tasks.add("trzy");
        //Then
        Assert.assertEquals("raz", board.getToDoList().tasks.get(1));
        Assert.assertEquals("dwa", board.getInProgressList().tasks.get(1));
        Assert.assertEquals("trzy", board.getDoneList().tasks.get(1));
    }
}