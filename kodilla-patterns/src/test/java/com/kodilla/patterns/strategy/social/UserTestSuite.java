package com.kodilla.patterns.strategy.social;

import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User george = new Millenials("George Bush");
        User soul = new YGeneration("Soul Berrenson");
        User patrick = new ZGeneration("Patrick Cluivert");
        //When & then
        george.sharePost();
        soul.sharePost();
        patrick.sharePost();
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User george = new Millenials("George Bush");
        User soul = new YGeneration("Soul Berrenson");
        User patrick = new ZGeneration("Patrick Cluivert");
        //When
        soul.setSocialPublisher(new FacebookPublisher());
        patrick.setSocialPublisher(new FacebookPublisher());
        //Then
        george.sharePost();
        soul.sharePost();
        patrick.sharePost();
    }
}