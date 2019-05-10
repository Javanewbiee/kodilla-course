package com.kodilla.spring2.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        ForumUser user = context.getBean(ForumUser.class);
        //When
        String result = user.getUsername();
        //Then
        Assert.assertEquals("John Smith",result);
    }
}
