package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {


    Forum theForum = new Forum();

    Map<Integer,ForumUser>doneList = theForum.getUsersList().stream()
            .filter(ForumUser -> ForumUser.getUserSex() == 'M')
            .filter(ForumUser -> ForumUser.getUserBirthDate().getYear()<2000)
            .filter(ForumUser -> ForumUser.getUserPosts()>0)
            .collect(Collectors.toMap(ForumUser::getUserID,ForumUser -> ForumUser));


     System.out.println(doneList);
    }
}
