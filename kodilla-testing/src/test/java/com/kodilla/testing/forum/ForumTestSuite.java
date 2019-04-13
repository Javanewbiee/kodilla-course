package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Test
    public void testCaseUsername() {
        //given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //when
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //assert
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName() {
        //given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //when
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //assert
        Assert.assertEquals("John Smith", result);
    }
    @Before
    public void before() {
        System.out.println("Test Case: Start");
    }
    @After
    public void after() {
        System.out.println("Test Case:End");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: End");
    }
}
