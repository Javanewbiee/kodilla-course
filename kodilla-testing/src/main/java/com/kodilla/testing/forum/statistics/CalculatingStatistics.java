package com.kodilla.testing.forum.statistics;


import java.util.List;

public class CalculatingStatistics {

    double averageNumberPostUser;
    double averageNumberCommentUser;
    double averageNumberCommentPost;
    int usersNumber;
    int numberOfPosts;
    int numberOfComments;

    public void calculateAdvStatistics(Statistics statistics){

        usersNumber = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        double userNumber= (double)usersNumber;
        double numbersOfComments= (double)numberOfComments;
        double numbersOfPosts= (double)numberOfPosts;
        averageNumberPostUser = numbersOfPosts/userNumber;
        averageNumberCommentUser = numbersOfComments/userNumber;
        averageNumberCommentPost = numbersOfComments/numbersOfPosts;

    }
    public int getNumberOfUsers(){
        return usersNumber;
    }
    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public double getAverageNumberPostUser(){
        return averageNumberPostUser;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberCommentUser() {
        return averageNumberCommentUser;
    }

    public double getAverageNumberCommentPost() {
        return averageNumberCommentPost;
    }
}
