package com.kodilla.testing.forum.statistics;


import java.util.List;

public class CalculatingStatistics {

    int usersNumber;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberPostUser;
    double averageNumberCommentUser;
    double averageNumberCommentPost;

    public void calculateAdvStatistics(Statistics statistics){

        usersNumber = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberPostUser = numberOfPosts/usersNumber;
        averageNumberCommentUser = numberOfComments/usersNumber;
        averageNumberCommentPost = numberOfComments/numberOfPosts;

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
