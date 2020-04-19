package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }

    @Scope("prototype")
    public TaskList getTaskList() {
        TaskList taskList = new TaskList();
        taskList.tasks.add("first task");
        return taskList;
    }
}
