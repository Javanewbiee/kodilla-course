package com.kodilla.spring2.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String username;

    public ForumUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
