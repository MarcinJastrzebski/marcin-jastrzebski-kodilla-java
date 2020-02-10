package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;
import java.util.*;

import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite {
    private StatisticsCounter statisticsCounter;
    private Statistics statistics;

    @Before
    public void before() {
        System.out.println("Test case: begin");

        statisticsCounter = new StatisticsCounter();
        statistics = Mockito.mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1000);
        List<String> list = generateListOfStrings(100);
        when(statistics.usersNames()).thenReturn(list);
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsIsZero() {
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsIsOneThousand() {
        //Given
        when(statistics.postsCount()).thenReturn(1000);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(1.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsZero() {
        //Given
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsLowerThanNumberOfPosts() {
        //Given
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(1.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(0.1, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(0.1, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsHigherThanNumberOfPosts() {
        //Given
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(0.1, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(1.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersIsZero() {
        //Given
        List<String> list = generateListOfStrings(0);
        when(statistics.usersNames()).thenReturn(list);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(0.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(1.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersIsOneHundred() {
        //Given
        List<String> list = generateListOfStrings(100);
        when(statistics.usersNames()).thenReturn(list);
        //When
        statisticsCounter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfPosts(), 0.0001);
        Assert.assertEquals(1000.0, statisticsCounter.getNumberOfComments(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgPostsPerUser(), 0.0001);
        Assert.assertEquals(10.0, statisticsCounter.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(1.0, statisticsCounter.getAvgCommentsPerPost(), 0.0001);
    }

    @Test
    public void testShowStatistics() {
        //Given

        //When
        statisticsCounter.showStatistics();
        //Then

    }

    private List<String> generateListOfStrings(int number) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            list.add("User" + i);
        }
        return list;
    }

}