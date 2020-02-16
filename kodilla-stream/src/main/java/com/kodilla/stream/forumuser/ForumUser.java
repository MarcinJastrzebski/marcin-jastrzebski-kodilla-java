package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int uniqueId, String username, char sex, LocalDate birthDate, int numberOfPosts) {
        this.uniqueId = uniqueId;
        this.username = username;
        if(sex=='M'||sex=='F') {
            this.sex = sex;
        }
        else{
            this.sex = 'F';
        }
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueId=" + uniqueId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", bithDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
