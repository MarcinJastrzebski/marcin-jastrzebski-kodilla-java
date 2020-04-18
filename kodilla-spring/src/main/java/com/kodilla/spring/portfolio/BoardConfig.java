package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList toDoList() {
        TaskList taskList = new TaskList();
        taskList.tasks.add("first task");
        return taskList;
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList inProgressList() {
        TaskList taskList = new TaskList();
        taskList.tasks.add("second task");
        return taskList;
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList doneList() {
        TaskList taskList = new TaskList();
        taskList.tasks.add("done task");
        return taskList;
    }
}
