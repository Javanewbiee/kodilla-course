package com.kodilla.rpsls;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTestSuite {

    @Test
    public void testGetPlayerPick() {
        //Given
        Player player = new Player("K");
        //When
        String result = player.getPlayerPick();
        //Then
        Assert.assertEquals("Rock",result);
    }
}
