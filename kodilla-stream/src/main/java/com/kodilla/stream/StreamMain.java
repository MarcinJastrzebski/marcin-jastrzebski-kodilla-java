package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> LocalDate.now().getYear()-forumUser.getBirthDate().getYear()>=20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUniqueId, forumUser -> forumUser));

        resultMapOfUsers.entrySet().stream().forEach(System.out::println);
    }
}