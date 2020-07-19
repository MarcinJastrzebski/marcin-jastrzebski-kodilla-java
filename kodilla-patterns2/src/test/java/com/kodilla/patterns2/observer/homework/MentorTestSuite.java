package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        // Given
        Student andrzej = new Student("Andrzej");
        Student michal = new Student("Michal");
        Student krzysiek = new Student("Krzysiek");

        Mentor mateuszRyndak = new Mentor("Mateusz Ryndak");
        Mentor mateuszLach = new Mentor("Mateusz Lach");

        andrzej.registerObserver(mateuszRyndak);
        michal.registerObserver(mateuszLach);
        krzysiek.registerObserver(mateuszRyndak);


        //When
        andrzej.addTask(new Task("Modul 1", "desc"));
        michal.addTask(new Task("Modul 2", "desc"));
        krzysiek.addTask(new Task("Modul 3", "desc"));
        andrzej.addTask(new Task("Modul 4", "desc"));

        //Then
        assertEquals(1, mateuszLach.getUpdateCount());
        assertEquals(3, mateuszRyndak.getUpdateCount());
    }


}