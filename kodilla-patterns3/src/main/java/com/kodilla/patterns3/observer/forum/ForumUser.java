package com.kodilla.patterns3.observer.forum;

public class ForumUser implements Observer {

    private final String name;
    private int updateCount;

    public ForumUser(String name) {
        this.name = name;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(name + " : New messeges in topic " + forumTopic.getName() + "\n" + "total " + forumTopic.getMesseges().size() + " messeges");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
