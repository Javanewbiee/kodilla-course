package com.kodilla.patterns3.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelp = new JavaHelpForumTopic();
        ForumTopic javaTools = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelp.registerObserver(johnSmith);
        javaTools.registerObserver(ivoneEscobar);
        javaHelp.registerObserver(jessiePinkman);
        javaTools.registerObserver(jessiePinkman);
        //When
        javaHelp.addPost("Hello everyone, could you help me with something?");
        javaHelp.addPost("What seems to be the problem?");
        javaTools.addPost("Help pls, my MySQL db doesnt work");
        javaHelp.addPost("I cant code in Java :)");
        javaTools.addPost("When i log i get bad credentials");
        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2,ivoneEscobar.getUpdateCount());
        Assert.assertEquals(5,jessiePinkman.getUpdateCount());
    }
}
