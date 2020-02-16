package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1,"user1", 'M', LocalDate.of(1987,2,11),0));
        listOfUsers.add(new ForumUser(2,"user2", 'M', LocalDate.of(1992,2,11),0));
        listOfUsers.add(new ForumUser(3,"user3", 'F', LocalDate.of(1994,2,11),1));
        listOfUsers.add(new ForumUser(4,"user4", 'M', LocalDate.of(1995,2,21),31));
        listOfUsers.add(new ForumUser(5,"user5", 'M', LocalDate.of(1996,2,15),13));
        listOfUsers.add(new ForumUser(6,"user6", 'F', LocalDate.of(2000,2,14),12));
        listOfUsers.add(new ForumUser(7,"user7", 'F', LocalDate.of(1987,2,13),16));
        listOfUsers.add(new ForumUser(8,"user8", 'M', LocalDate.of(1934,2,12),0));
        listOfUsers.add(new ForumUser(9,"user9", 'M', LocalDate.of(1922,2,1),0));
        listOfUsers.add(new ForumUser(10,"user10", 'M', LocalDate.of(1911,2,1),0));
        listOfUsers.add(new ForumUser(11,"user11", 'F', LocalDate.of(1978,2,1),0));
        listOfUsers.add(new ForumUser(12,"user12", 'F', LocalDate.of(1956,2,1),13));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(listOfUsers);
    }
}
