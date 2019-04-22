package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthDate;
    private final int userPosts;

    public ForumUser(final int userID,final String userName,final char userSex,final LocalDate userBirthDate,final int userPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.userPosts = userPosts;
    }

    public int getUserID() {
        return userID;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPosts() {
        return userPosts;
    }
    public boolean ageCheck(){
        if((LocalDate.now().getYear()-userBirthDate.getYear())>=20) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID = " + userID +
                ", userName = '" + userName + '\'' +
                ", userSex = " + userSex +
                ", userBirthDate = " + userBirthDate +
                ", userPosts = " + userPosts +
                '}' + "\n";
    }
}
