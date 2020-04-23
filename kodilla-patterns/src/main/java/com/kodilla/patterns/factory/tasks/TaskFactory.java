package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Zakupy w żabce", "ketchup", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("Malowanie pokoju", "Pink", "Living room");
            case DRIVINGTASK:
                return new DrivingTask("Drive to mc'donalds", "The nearest Mc'donalds", "car");
            default:
                return null;
        }
    }
}