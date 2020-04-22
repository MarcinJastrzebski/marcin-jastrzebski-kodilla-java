package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("I am a Twitter Publisher");
    }
}
