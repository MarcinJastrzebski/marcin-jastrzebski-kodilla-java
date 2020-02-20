package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 3));
        } catch (Exception e) {
            System.out.println("Probably you tried to usage wrong variable");
        } finally {
            System.out.println("If you incorrectly set x or y, I will not show you my return value");
        }
    }
}
