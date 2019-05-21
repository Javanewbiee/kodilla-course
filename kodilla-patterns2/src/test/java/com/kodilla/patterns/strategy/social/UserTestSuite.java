package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user = new ZGeneration("Riv");
        User user1 = new YGeneration("Hatsuki");
        User user2 = new Millenials("Staszek");
        //When
        String userUses = user.share();
        System.out.println(userUses);
        String user1Uses = user1.share();
        System.out.println(user1Uses);
        String user2Uses = user2.share();
        System.out.println(user2Uses);
        //Then
        Assert.assertEquals("User is using Twitter", userUses);
        Assert.assertEquals("User is using FaceBook", user1Uses);
        Assert.assertEquals("User is using Snapchat", user2Uses);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new ZGeneration("Riv");
        //When
        String userUses = user.share();
        System.out.println(userUses);
        user.sharePost(new FacebookPublisher());
        String userNowUses = user.share();
        System.out.println("User changed sharing media and now " + userNowUses);
        //Then
        Assert.assertEquals("User is using FaceBook", userNowUses);
    }
}
