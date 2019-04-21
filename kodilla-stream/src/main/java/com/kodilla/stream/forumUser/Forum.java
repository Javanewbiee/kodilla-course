package com.kodilla.stream.forumUser;

import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser>usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1, "UserOne",'M', LocalDate.of(1985,5,12), 5));
        usersList.add(new ForumUser(2,"UserTwo",'F', LocalDate.of(1999, 6, 17),1));
        usersList.add(new ForumUser(3,"UsertThree", 'M', LocalDate.of(2005,6,25), 7));
        usersList.add(new ForumUser(4,"UserFour",'F', LocalDate.of(2000,4,20),3));
        usersList.add(new ForumUser(5,"UserFive",'M', LocalDate.of(1995,3,26), 4));
        usersList.add(new ForumUser(6,"UserSix",'M', LocalDate.of(1975,1,27), 3));
        usersList.add(new ForumUser(7,"UserSeven",'F', LocalDate.of(2004,2,15),1));
        usersList.add(new ForumUser(8,"UserEight",'M', LocalDate.of(1984,8,12), 0));
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
