package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private String userAlias;
    private String eMail;
    private int phoneNumber;

    public User(String userName, String userAlias, String eMail, int phoneNumber) {
        this.userName = userName;
        this.userAlias = userAlias;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}


