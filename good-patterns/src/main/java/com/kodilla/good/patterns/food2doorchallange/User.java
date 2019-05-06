package com.kodilla.good.patterns.food2doorchallange;

public class User {

    private String userName;
    private int userPhoneNumber;
    private String userEMail;
    private String adress;

    public User(String userName, int userPhoneNumber, String userEMail, String adress) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userEMail = userEMail;
        this.adress = adress;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserEMail() {
        return userEMail;
    }

    public String getAdress() {
        return adress;
    }
}
