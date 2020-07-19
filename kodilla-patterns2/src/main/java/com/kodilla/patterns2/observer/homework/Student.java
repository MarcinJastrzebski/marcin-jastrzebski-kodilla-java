package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements Observable {
    private final String username;
    private final List<Observer> observers;
    private Queue<Task> taskQueue;

    public Student(String username) {
        this.username = username;
        observers = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
    }
    public void addTask(Task task){
        taskQueue.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getUsername() {
        return username;
    }

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }
}
