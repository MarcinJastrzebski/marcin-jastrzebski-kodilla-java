package com.kodilla.testing.forum.statistics;

import javax.crypto.spec.PSource;

public class StatisticsCounter {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        this.avgPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
        this.avgCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        this.avgCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;

        if (numberOfUsers == 0) {
            this.avgPostsPerUser = 0.0;
            this.avgCommentsPerUser = 0.0;
        }

        if (numberOfPosts == 0) {
            this.avgCommentsPerPost = 0.0;
        }

    }

    public void showStatistics() {
        System.out.println("STATISTICS:");
        System.out.println("-----------");
        System.out.println("USERS: " + getNumberOfUsers());
        System.out.println("POSTS: " + getNumberOfPosts());
        System.out.println("COMMENTS:" + getNumberOfPosts());
        System.out.println("AVG. POSTS PER USER:" + getAvgPostsPerUser());
        System.out.println("AVG. COMMENTS PER USER:" + getAvgCommentsPerPost());
        System.out.println("AVG. COMMENTS PER POST:" + getAvgCommentsPerPost());

    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }
}