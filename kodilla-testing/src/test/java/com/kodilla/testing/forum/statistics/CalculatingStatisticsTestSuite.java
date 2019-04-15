package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatingStatisticsTestSuite {

    private static int counter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting test");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test ended");
    }
    @Before
    public void before(){
        counter++;
        System.out.println("Test number " + counter);
    }

    @Test
    public void testCalculateAdvStatisticsAverageCommentPostMorePostsThenComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
            usersNames.add("a");
        int numberOfPosts = 10;
        int numberOfComments = 2;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberCommentPost();
        //Then
        Assert.assertEquals(0.2, result, 0.2);
    }
    @Test
    public void testCalculateAdvStatisticsAverageCommentPostMoreCommentsThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
            usersNames.add("a");
        int numberOfPosts = 2;
        int numberOFComments = 10;
        when(statisticsMock.commentsCount()).thenReturn(numberOFComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberCommentPost();
        //Then
        Assert.assertEquals(5, result, 0);
    }
    @Test
    public void testCalculateAdvStatisticsAveragePostUserMoreUsersThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
        for(int i =0; i<100; i++){
            usersNames.add("a");
        }
        int numberOfPosts = 10;
        int numberOfComments = 100;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberPostUser();
        //Then
        Assert.assertEquals(0.1, result, 0.1);
    }
    @Test
    public void testCalculateAdvStatisticsAveragePostUserMorePostsThenUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
        for(int i =0; i<100; i++){
            usersNames.add("a");
        }
        int numberOfPosts = 1000;
        int numberOfComments = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberPostUser();
        //Then
        Assert.assertEquals(10, result, 0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentUserMoreUsersThenComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
        for(int i =0; i<100; i++){
            usersNames.add("a");
        }
        int numberOfComments = 0;
        int numberOfPosts = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberCommentUser();
        //Then
        Assert.assertEquals(0, result, 0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentUserMoreCommentsThenUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistics stat = new CalculatingStatistics();
        List<String>usersNames = new ArrayList<String>();
        for(int i =0; i<100; i++){
            usersNames.add("a");
        }
        int numberOfComments = 1000;
        int numberOfPosts = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        //When
        stat.calculateAdvStatistics(statisticsMock);
        double result = stat.getAverageNumberCommentUser();
        //Then
        Assert.assertEquals(10, result, 0);
    }
}
